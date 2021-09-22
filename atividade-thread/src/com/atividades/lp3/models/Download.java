package com.atividades.lp3.models;

public class Download extends Thread {

    private int size;
    private int currentSize;

    public Download() {
    }

    public Download(int size) {
        this.size = size;
    }

    public void run(){
        super.run();
        for (int i = 0; i <= size; i++){
            this.currentSize = i;

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Finished Thread - Download");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
}
