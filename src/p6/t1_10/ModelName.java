package p6.t1_10;

public enum ModelName {

    ASUS_STRIX (1),
    MacBook_Air15 (2),
    HP_Envy (3);

    private int selector;

    ModelName(int selector){
        this.selector = selector;
    }

}
