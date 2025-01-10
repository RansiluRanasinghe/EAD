/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassFiles;

import java.io.FileWriter;

/**
 *
 * @author dinis
 */
public class OTPWriter {
    public static void otpGen(String id, int otp, String reason) {

        String content = "This is from Payment System,\n"
                + "\n"
                + "For Student ID:  "+id+"\n"
                + "\n"
                + "This is your One Time Passcode\n"
                + ""+otp+"\n"
                + "\n"
                + "Use this to "+reason+"";

        try {
            // creating file witer object and pass the name of the file as parameter
            FileWriter fw = new FileWriter("Payment System OTP" + id + ".txt");

            // write the file on the project location
            fw.write(content);
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
