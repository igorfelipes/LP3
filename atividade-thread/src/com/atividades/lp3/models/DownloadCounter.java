package com.atividades.lp3.models;

public class DownloadCounter extends Thread{

    private Download download;

    public DownloadCounter() {

    }

    public DownloadCounter(Download download) {
        this.download = download;
    }

    public void run(){
        super.run();

        while(download.getCurrentSize() < download.getSize()){
            try{
                System.out.println("Loading... | "+ this.download.getCurrentSize() +"/"+ download.getSize() + " |");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Finished Download |"+ download.getCurrentSize() +"/"+ download.getSize() + "|");
        System.out.println("Finished Thread Download Counter");
    }

}
