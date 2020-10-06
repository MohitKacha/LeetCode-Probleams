public  class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            if(!map.containsKey(ch))
                map.put(ch,0);
            map.put(ch,map.get(ch) + 1);
        }

        for(char ch : ransomNote.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) <=0)
                return false;

            map.put(ch,map.get(ch) - 1);
        }
        return true;
    }


}