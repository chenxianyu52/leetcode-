public class Codec {
    private String key = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private HashMap<String, String> hashMap = new HashMap<>();
    private Random random = new Random();
    private String shortPre = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(key.charAt(random.nextInt(62)));
        }
        hashMap.put(sb.toString(), longUrl);
        return shortPre + sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hashMap.get(shortUrl.replace(shortPre, ""));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

/**
 * 解答成功:
 * 执行耗时:3 ms,击败了66.00% 的Java用户
 * 内存消耗:41.1 MB,击败了73.34% 的Java用户
 */