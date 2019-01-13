package com.kd.tries;

import java.util.Set;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        
        Set<Character> Keys=trie.root.children.keySet();
        for(Character key:Keys) {
        	System.out.println(key);
        }
        Set<Character> keys=trie.root.children.get('c').children.keySet();
        for(Character key:keys) {
        	System.out.println(key);
        }
        
    }
}