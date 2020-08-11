package wansun.visit.android.utils;


import android.util.Base64;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * RSA非对称加密工具
 * 
 * @author nasico
 *
 */
public class RSAUtils {

    /**
     * 公钥加密
     */
    public static String encryptByPublicKey(String data, String key)
            throws GeneralSecurityException
    {
        byte[] keyBytes = Base64.decode(key, Base64.DEFAULT);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        PublicKey pubKey = keyFactory.generatePublic(keySpec);

        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        byte[] mi = cipher.doFinal(data.getBytes());

        return Base64.encodeToString(mi, Base64.DEFAULT);
    }



	public  static String encrykey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCjnarkIhYCnJwPY5ETeVAc6tX/3f4ytm30WX4/DKuQzqYF1RKP305tTc7PPWEjkUKKD8iLKOgwS96ghgbO3eXCXQRjNrReHjtNoqyFINZW7dp/Xw0Aq9HXPNJzGCQbaWAZe3FqMUQhvcj+G5jeyGB7nagAHszsq8WJ3iTSY+HUgQIDAQAB";

    public static String PRIVETEKEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKOdquQiFgKcnA9jkRN5UBzq1f/d/jK2bfRZfj8Mq5DOpgXVEo/fTm1Nzs89YSORQooPyIso6DBL3qCGBs7d5cJdBGM2tF4eO02irIUg1lbt2n9fDQCr0dc80nMYJBtpYBl7cWoxRCG9yP4bmN7IYHudqAAezOyrxYneJNJj4dSBAgMBAAECgYBK+okCzMALaFt4DefA5doZtmBlRgUklkdjL9PT7ul8jca1a4R7HBljq8F3ZShr1TiJ7lu3sgJdh5c5NtJN4JBWORvBBgVYrMy+D3ykgV9GueHZL8tShfdzgGxhMMM032oIWRtqajLkLMRI3YusQGw5LmjB/7NCwZN4TFCX5S16sQJBAOyw5aW9B7aU7R5WIWQkWUnJJA69gkhrwdrIaBjSt8ur8oGAG0++D5qmcoM0sLcXmrU61B/t/6PE5aH8fX0uxh0CQQCw9qerAyD1W21TlTye2tHX7DM+4hph++e2cchmAK3Lc93ZHm30PV3o3HtDy4SCFjCgiTH1XUf5iRGMTPudWyq1AkEAuiH61rWq5SiEuECfjbMQDHiDRJw/YlhrYHQNeMftBdw4nyJxV+ptNv8COrAq8DE91ptmyZ1OVim3NAXtYY5w+QJAKPAWn6gsorYQ14opqPIkI1hgDocN5Wb6FqnB218C1ZMrWkQA2cSsiecfmPJm6BUsEKdMaF+4+9AqwBM7Dg7+FQJBAIutjT4QatAVbGTAjmRnM0JusezhdrNOILowiBYR/K6iAaUB9qjVG74kTmjnmuRtCqXSFQa8wjHnC+EGkkjWWnA=";




public  static  byte [] decrypt( byte [] cipherData) throws  Exception{

    Cipher cipher=null;
    try {
        byte[] keyBytes = Base64.decode(encrykey, Base64.DEFAULT);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        PublicKey pubKey = keyFactory.generatePublic(keySpec);

        cipher=Cipher.getInstance("RSA");
        logUtils.d("cipher");
        cipher.init(Cipher.DECRYPT_MODE,pubKey);
        byte [] data=cipher.doFinal(cipherData);
        return  data;
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    } catch (NoSuchPaddingException e) {
        e.printStackTrace();
    } catch (InvalidKeyException e) {
        e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
        e.printStackTrace();
    } catch (BadPaddingException e) {
        e.printStackTrace();
    }
    return null;
}



	}
