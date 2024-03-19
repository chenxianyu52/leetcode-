class MagicDictionary {
    Map<Integer,List<String>> map = new HashMap<>();

    public MagicDictionary() {

    }

    public void buildDict(String[] dictionary) {
        for(String str:dictionary){
            List<String> list = map.getOrDefault(str.length(),new ArrayList<>());
            list.add(str);
            map.put(str.length(),list);
        }
    }

    public boolean search(String searchWord) {
        if(map.get(searchWord.length()) == null){
            return false;
        }
        char[] charsSearch = searchWord.toCharArray();
        List<String> list = map.getOrDefault(charsSearch.length,new ArrayList<>());
        for(int i = 0;i<list.size();i++){
            char[] charsStr = list.get(i).toCharArray();
            int diff = 0;
            for(int j = 0;j<charsSearch.length;j++){
                if(charsSearch[j] != charsStr[j]){
                    diff++;
                }
                if(diff > 1){
                    break;
                }
            }
            if(diff == 1){
                return true;
            }
        }
        return false;
    }
}