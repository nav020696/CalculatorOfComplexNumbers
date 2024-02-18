package model;

public interface Calculable<T> {
    T summation(T element1, T element2);
    T subtraction(T element1, T element2);
    T multiplication(T element1, T element2);
    T division(T element1, T element2);
}
