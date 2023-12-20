package Mirea.Homework4.Class;

public class Hand {
    private int fingerCount;
    private boolean hasThumb;

    public Hand(int fingerCount, boolean hasThumb) {
        this.fingerCount = fingerCount;
        this.hasThumb = hasThumb;
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public void setFingerCount(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    public boolean isHasThumb() {
        return hasThumb;
    }

    public void setHasThumb(boolean hasThumb) {
        this.hasThumb = hasThumb;
    }
}
