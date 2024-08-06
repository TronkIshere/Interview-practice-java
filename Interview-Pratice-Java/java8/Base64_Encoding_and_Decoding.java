package java8;

import java.util.Base64;

// Source: https://www.baeldung.com/java-base64-encode-and-decode
// https://gpcoder.com/4144-base64-encoding-va-decoding-trong-java-8/ (vietnamese)

public class Base64_Encoding_and_Decoding {
    // The basic encoder keeps things simple and encodes the input as-is, without any line separation.
    // The encoder maps the input to a set of characters in the A-Za-z0-9+/ character set.

    // Java 8 Basic Base64
    // encode a simple String:
    String originalInput = "test input";
    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

    // Let’s now decode that String back to the original form:
    byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
    String decodedString = new String(decodedBytes);

    // Java 8 Base64 Encoding Without Padding
    // In Base64 encoding, the length of an output-encoded String must be a multiple of four.
    // If necessary, the encoder adds one or two padding characters (=) at the end of the output
    // as needed in order to meet this requirement.

    // Sometimes, we need to skip the padding of the output. For instance, the resulting
    // String will never be decoded back. So, we can simply choose to encode without padding:
    String encodedString2 =
            Base64.getEncoder().withoutPadding().encodeToString(originalInput.getBytes());

    // Java 8 URL Encoding
    // URL encoding is very similar to the basic encoder. Also, it uses the URL and Filename Safe Base64 alphabet.
    // In addition, it does not add any line separation:
    String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
    String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
    // Decoding happens in much the same way. The getUrlDecoder() utility method
    // returns a java.util.Base64.Decoder. So, we use it to decode the URL:
    byte[] decodedBytes2 = Base64.getUrlDecoder().decode(encodedUrl);
    String decodedUrl = new String(decodedBytes);

    // Many more need to read in link
}
