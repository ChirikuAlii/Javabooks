package com.company.javabooks;

public class Books {

    private String _name;
    private String _author;
    private  int _Pages;

    public Books(){

    }
    public Books(String _name, String _author, int _Pages) {
        this._name = _name;
        this._author = _author;
        this._Pages = _Pages;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public int get_Pages() {
        return _Pages;
    }

    public void set_Pages(int _Pages) {
        this._Pages = _Pages;
    }

    public void read (){

        System.out.println("Reading");
    }

    public void writing (){

        System.out.println("Writing");
    }
}
