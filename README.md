# Задача 1. Межпоточный диалог
Описание

Так как мы уже научились работать с потоками, сейчас нам необходимо создать несколько потоков (3-4 потока), которые каждые 2-3 секунды отправляют в консоль некоторое сообщение, обязательно содержащее имя потока, которое было задано при создании. Поток должен выполнять бесконечный цикл вывода сообщения и сна (задержки). Главный поток программы (метод main) должен дать поработать остальным потокам какое-то время (секунд 15), а потом одним методом завершить все созданные ранее потоки.
Функционал программы

    Создание 4 потоков, каждый из которых имеет свое имя.
    Каждые 2-3 секунды поток печатает сообщение в консоль. Обязательно в сообщении должно фигурировать имя потока
    Через какое-то время (например 15 секунд), главный поток должен одним методом завершить все созданные ранее потоки
