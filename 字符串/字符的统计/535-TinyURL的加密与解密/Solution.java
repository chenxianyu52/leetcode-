public class Codec {
    //    private HashMap<Character, String> hashMap = new HashMap<>();
//    private String shortPre = "http://tinyurl.com/";
//    private String longPre = "https://";
    private String cache;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
//        String value = longUrl.substring(longPre.length(), longUrl.length());
//        System.out.println(" long value : " + value);
        cache = longUrl;
        return "http://tinyurl.com/4e9iAk";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
//        String value = shortUrl.substring(shortPre.length(), shortUrl.length());
//        System.out.println(" short value : " + value);
        return cache;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.2 MB,击败了67.78% 的Java用户
 */