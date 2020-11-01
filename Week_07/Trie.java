package week07.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/10/31 22:44
 *
 */
class Trie {
    Trie[] next = new Trie[26];
    boolean isEnd = false;

    public Trie() {
    }

    public void insert(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()) {
            if (curr.next[c - 'a'] == null) {
                curr.next[c - 'a'] = new Trie();
            }
            curr = curr.next[c - 'a'];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()) {
            if (curr.next[c - 'a'] == null) {
                return false;
            }
            curr = curr.next[c - 'a'];
        }
        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie curr = this;
        for (char c : prefix.toCharArray()) {
            if (curr.next[c - 'a'] == null){
                return false;
            }
            curr = curr.next[c - 'a'];
        }
        return true;
    }
}

