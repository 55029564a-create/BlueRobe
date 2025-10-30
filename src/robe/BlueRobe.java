package robe;

public class BlueRobe {
    private final String ITEM_NAME = "파란색 가운 (남)";
    private Integer upPlus = 0;
    private final String EQUIP = "한벌옷";
    private final Integer PHYSICAL_DEF = 30;
    private final Integer EVA = 10;
    private Integer str = 0;
    private Integer dex = 0;
    private Integer intel = 0;
    private Integer luk = 0;
    private Integer upgrade = 10;

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public String getEQUIP() {
        return EQUIP;
    }

    public Integer getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        this.upgrade = upgrade;
    }

    public Integer getEVA() {
        return EVA;
    }

    public Integer getPHYSICAL_DEF() {
        return PHYSICAL_DEF;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getUpPlus() {
        return upPlus;
    }

    public void setUpPlus(Integer upPlus) {
        this.upPlus = upPlus;
    }

    public Integer getDex() {
        return dex;
    }

    public void setDex(Integer dex) {
        this.dex = dex;
    }

    public Integer getIntel() {
        return intel;
    }

    public void setIntel(Integer intel) {
        this.intel = intel;
    }

    public Integer getLuk() {
        return luk;
    }

    public void setLuk(Integer luk) {
        this.luk = luk;
    }
    @Override
    public String toString() {
        return ITEM_NAME + (upPlus == 0 ? "" : " +" + "(" + upPlus + ")") + "\n" +
                "장비분류 : +" + EQUIP + "\n" +
                (str == 0 ? "" : "STR : +" + str+ "\n") +
                (dex == 0 ? "" : "DEX : +" + dex+ "\n") +
                (intel == 0 ? "" : "INT : +" + intel + "\n") +
                (luk == 0 ? "" : "LUK : +" + luk + "\n") +
                "물리방어력 : +" + PHYSICAL_DEF + "\n" +
                "회피율 : +" + EVA + "\n" +
                "업그레이드 가능 횟수 : " + upgrade + "\n";
    }
}
