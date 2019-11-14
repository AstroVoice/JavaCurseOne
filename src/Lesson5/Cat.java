package Lesson5;

public class Cat extends Animal {
    public Cat() {
        this.name = "Котэ";
        this.maxRunDistance = 200.0f;
        this.maxSwimDistance = 0;
        this.maxJumpDistance = 2.0f;
    }
    public Cat(String _name, float _maxRunDistance, float _maxSwimDistance, float _maxJumpDistance) {
        this.name = _name;
        this.maxRunDistance = _maxRunDistance;
        this.maxSwimDistance = _maxSwimDistance;
        this.maxJumpDistance = _maxJumpDistance;
    }
    public Cat(float _maxRunDistance, float _maxSwimDistance, float _maxJumpDistance) {
        this.name = "CAT";
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
