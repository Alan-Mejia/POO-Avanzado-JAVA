package com.alan.paquete1;

public class Persona {
    private String name;

    private int age;

    private String id;

    public Persona( String name, int age, String id )
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Persona(Persona obj){
        this.name= obj.name;
        this.age= obj.age;
        this.id=obj.id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }
}
