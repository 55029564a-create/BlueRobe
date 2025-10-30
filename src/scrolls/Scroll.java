package scrolls;

public class Scroll {
    private final boolean hunderedScroll = true;
    private final boolean sixtyScroll = (int)(Math.random() * 100) + 1 < 60;
    private final boolean tenScroll = (int)(Math.random() * 100) + 1 < 10;

//    public int
    private Integer count = 0;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public boolean isHunderedScroll() {
        return hunderedScroll;
    }

    public boolean isSixtyScroll() {
        return sixtyScroll;
    }

    public boolean isTenScroll() {
        return tenScroll;
    }
}
