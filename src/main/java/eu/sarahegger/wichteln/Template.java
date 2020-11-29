
package eu.sarahegger.wichteln;

/**
 * Responsive template kindly provided by https://www.dyspatch.io/resources/templates/
 */
public class Template {
    private String senderName;
    private String recipientName;

    public Template(String senderName, String recipientName) {
        this.senderName = senderName;
        this.recipientName = recipientName;
    }

    /**
     * You might wanna change the picture in l.141
     * @return an html email that gets sent to the giver, greets them with their name and tells them
     * the name of their receiver.
     */
    public String returnContent(){
        StringBuilder content = new StringBuilder();
        content.append("<!doctype html>\n" +
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "    <title>\n" +
                "    </title>\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <style type=\"text/css\">\n" +
                "      #outlook a{padding: 0;}\n" +
                "      \t\t\t.ReadMsgBody{width: 100%;}\n" +
                "      \t\t\t.ExternalClass{width: 100%;}\n" +
                "      \t\t\t.ExternalClass *{line-height: 100%;}\n" +
                "      \t\t\tbody{margin: 0; padding: 0; -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%;}\n" +
                "      \t\t\ttable, td{border-collapse: collapse; mso-table-lspace: 0pt; mso-table-rspace: 0pt;}\n" +
                "      \t\t\timg{border: 0; height: auto; line-height: 100%; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic;}\n" +
                "      \t\t\tp{display: block; margin: 13px 0;}\n" +
                "    </style>\n" +
                "    <!--[if !mso]><!-->\n" +
                "    <style type=\"text/css\">\n" +
                "      @media only screen and (max-width:480px) {\n" +
                "      \t\t\t  \t\t@-ms-viewport {width: 320px;}\n" +
                "      \t\t\t  \t\t@viewport {\twidth: 320px; }\n" +
                "      \t\t\t\t}\n" +
                "    </style>\n" +
                "    <!--<![endif]-->\n" +
                "    <!--[if mso]>\n" +
                "    <xml>\n" +
                "        <o:OfficeDocumentSettings>\n" +
                "            <o:AllowPNG/>\n" +
                "            <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "        </o:OfficeDocumentSettings>\n" +
                "    </xml>\n" +
                "    <![endif]-->\n" +
                "    <!--[if lte mso 11]>\n" +
                "    <style type=\"text/css\">\n" +
                "\t\t\t.outlook-group-fix{width:100% !important;}\n" +
                "\t\t</style>\n" +
                "    <![endif]-->\n" +
                "    <style type=\"text/css\">\n" +
                "      @media only screen and (min-width:480px) {\n" +
                "      .dys-column-per-100 {\n" +
                "      \twidth: 100.000000% !important;\n" +
                "      \tmax-width: 100.000000%;\n" +
                "      }\n" +
                "      }\n" +
                "      @media only screen and (max-width:480px) {\n" +
                "\n" +
                "      \t\t\t  table.full-width-mobile { width: 100% !important; }\n" +
                "      \t\t\t\ttd.full-width-mobile { width: auto !important; }\n" +
                "\n" +
                "      }\n" +
                "      @media only screen and (min-width:480px) {\n" +
                "      .dys-column-per-100 {\n" +
                "      \twidth: 100.000000% !important;\n" +
                "      \tmax-width: 100.000000%;\n" +
                "      }\n" +
                "      }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "    <!--[if mso | IE]>\n" +
                "    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
                "    <![endif]-->\n" +
                "    <div style='margin:0px auto;max-width:600px;'>\n" +
                "        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\n" +
                "            <tbody>\n" +
                "            <tr>\n" +
                "                <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
                "                    <!--[if mso | IE]>\n" +
                "                    <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
                "                    <![endif]-->\n" +
                "                    <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
                "                        <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
                "                            <tr>\n" +
                "                                <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
                "                                    <div style='color:#000000;font-family:Open Sans, Arial, sans-serif;font-size:18px;font-weight:bold;line-height:20px;text-align:center;'>");
        content.append("Hallo " + senderName + "!");
        content.append("</div>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            <tr>\n" +
                "                                <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
                "                                    <div style='color:#000000;font-family:Open Sans, Arial, sans-serif;font-size:18px;line-height:20px;text-align:center;'>");
        content.append("The Wichtel Hat has decided: This year you will give a present to " +
                recipientName + ".\n" +
                "Merry Christmas!");
        content.append("</div>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                        </table>\n" +
                "                    </div>\n" +
                "                    <!--[if mso | IE]>\n" +
                "                    </td></tr></table>\n" +
                "                    <![endif]-->\n" +
                "                </td>\n" +
                "            </tr>\n" +
                "            </tbody>\n" +
                "        </table>\n" +
                "    </div>\n" +
                "    <!--[if mso | IE]>\n" +
                "    </td></tr></table>\n" +
                "    <![endif]-->\n" +
                "    <!--[if mso | IE]>\n" +
                "    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
                "    <![endif]-->\n" +
                "    <div style='margin:0px auto;max-width:600px;'>\n" +
                "        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\n" +
                "            <tbody>\n" +
                "            <tr>\n" +
                "                <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
                "                    <!--[if mso | IE]>\n" +
                "                    <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
                "                    <![endif]-->\n" +
                "                    <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
                "                        <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
                "                            <tr>\n" +
                "                                <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
                "                                    <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-collapse:collapse;border-spacing:0px;'>\n" +
                "                                        <tbody>\n" +
                "                                        <tr>\n" +
                "                                            <td style='width:333px;'>");
        content.append("<img alt='Merry Christmas!' height='100%' src='###INSERT YOUR HOLIDAY PICTURE HERE###' style='border:0;display:block;font-size:13px;height:303px;outline:none;text-decoration:none;width:100%;' width='150' />\n" +
                "                                            </td>\n" +
                "                                        </tr>\n" +
                "                                        </tbody>\n" +
                "                                    </table>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                        </table>\n" +
                "                    </div>\n" +
                "                    <!--[if mso | IE]>\n" +
                "                    </td></tr></table>\n" +
                "                    <![endif]-->\n" +
                "                </td>\n" +
                "            </tr>\n" +
                "            </tbody>\n" +
                "        </table>\n" +
                "    </div>\n" +
                "    <!--[if mso | IE]>\n" +
                "    </td></tr></table>\n" +
                "    <![endif]-->\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
        return content.toString();
    }
}
