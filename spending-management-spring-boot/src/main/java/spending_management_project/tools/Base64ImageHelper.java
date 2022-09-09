package spending_management_project.tools;


import spending_management_project.enums.ErrorType;import spending_management_project.exception.CommonsException; /**
 * decode base64 image utilities.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 9/10/15
 * @since JDK1.8
 */
public class Base64ImageHelper {

  // ------------------------
  // PUBLIC METHODS
  // ------------------------

  /**
   * Transform Mr.Base64Image to Headless Knight.
   *
   * @param image Mr.Base64Image
   * @return Headless Knight
   * @throws CommonsException not in the list
   */
  public static byte[] transformToHeadlessKnight(String image) throws CommonsException {
    return org.apache.commons.codec.binary.Base64.decodeBase64(cutHead(image));
  }

  private final static String HAIR = "data:image/";
  private final static String NECK = ";base64,";
  private final static String PNG = "png";
  private final static String JPEG = "jpeg";
  private final static String JPG = "jpg";
  private final static String GIF = "gif";

  // ------------------------
  // PRIVATE METHODS
  // ------------------------

  /**
   * Cut head!
   * Mr.Base64Image to Mr.headless.
   *
   * @param image Mr.Base64Image
   * @return Mr.Headless
   * @throws CommonsException not in the list
   */
  private static String cutHead(String image) throws CommonsException {
    return image.replace(formHead(cutWhom(image)), "");
  }

  /**
   * I'll Form the Head!
   *
   * @param face face
   * @return head
   */
  private static String formHead(String face) {
    return String.join("", Base64ImageHelper.HAIR, face, Base64ImageHelper.NECK);
  }

  /**
   * Who‘s the poor guy, let me check the list.
   *
   * @param image luckless guy
   * @return name of luckless guy
   * @throws CommonsException not in the list
   */
  private static String cutWhom(String image) throws CommonsException {
    if (image.contains(PNG)) {
      return PNG;
    } else if (image.contains(JPEG)) {
      return JPEG;
    } else if (image.contains(JPG)) {
      return JPG;
    } else if (image.contains(GIF)) {
      return GIF;
    } else {
      throw new CommonsException(ErrorType.SYS0005);
    }
  }

}