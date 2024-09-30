package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
        if(s.length()==0||str.length==0||s.length()!=str.length)
        return false;

        for(int i = 0;i < s.length(); i++){
            if(!(str[i] == s.getChar(i)))
            return false;
        }
        return true;
    }
    public void reverse() {
        String1 Nstring = new String1();
        int Nsize = (this.size)-1;
        
        for(int i = 0;i<size;i++)
            Nstring.append(str[Nsize--]);

        for(int i = 0; i<size;i++)
            str[i]=Nstring.getChar(i);
    }
}
