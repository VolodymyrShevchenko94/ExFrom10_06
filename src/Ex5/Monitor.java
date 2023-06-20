package Ex5;

public class Monitor {
    private  int resolutionX;
    private int getResolutionY;

    public Monitor(int resolutionX, int getResolutionY) {
        this.resolutionX = resolutionX;
        this.getResolutionY = getResolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getGetResolutionY() {
        return getResolutionY;
    }

    public void setGetResolutionY(int getResolutionY) {
        this.getResolutionY = getResolutionY;
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", " + "X=" + resolutionX + ", Y=" + resolutionY;
//    }
}
