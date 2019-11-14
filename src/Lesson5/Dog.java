package Lesson5;

public class Dog extends Animal {
    public Dog() {
        this.name = "Собакен";
        this.maxRunDistance = 500.0f;
        this.maxSwimDistance = 10.0f;
        this.maxJumpDistance = 0.5f;
    }
    public Dog(String _name, float _maxRunDistance, float _maxSwimDistance, float _maxJumpDistance) {
        this.name = _name;
        this.maxRunDistance = _maxRunDistance;
        this.maxSwimDistance = _maxSwimDistance;
        this.maxJumpDistance = _maxJumpDistance;
    }
    public Dog(float _maxRunDistance, float _maxSwimDistance, float _maxJumpDistance) {
        this.name = "DOG";
        this.maxRunDistance = _maxRunDistance;
        this.maxSwimDistance = _maxSwimDistance;
        this.maxJumpDistance = _maxJumpDistance;
    }
    @Override
    public boolean run(float _distance){
        boolean res = false;
        if (_distance <=this.maxRunDistance) res = true;
        System.out.println(this.name);
        System.out.println("Бег: "+ (res==true? "пройден":"провален"));
        return res;
    }
    @Override
    public boolean swim(float _distance){
        boolean res = false;
        if (_distance <=this.maxSwimDistance) res = true;
        System.out.println(this.name);
        System.out.println("Плыть: "+ (res==true? "пройден":"провален"));
        return res;
    }
    @Override
    public boolean jump(float _distance){
        boolean res = false;
        if (_distance <=this.maxJumpDistance) res = true;
        System.out.println(this.name);
        System.out.println("Прыжок: "+ (res==true? "пройден":"провален"));
        return res;
    }
}