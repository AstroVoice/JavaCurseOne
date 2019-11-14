package Lesson5;

abstract class Animal {
    public String name;
    protected float maxRunDistance;
    protected float maxSwimDistance;
    protected float maxJumpDistance;

    public Animal() {
    }

    public Animal(String _name) {
        this.name = _name;
    }

    abstract boolean run(float _distance);

    abstract boolean swim(float _distance);

    abstract boolean jump(float _distance);
}


