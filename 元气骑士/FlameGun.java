import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 火焰机枪
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlameGun extends Weapon {
    
    public boolean isCatch; // 是否被拿起
    private static int shootBufferTime = 10; // 射击缓冲时间
    private static int blueConsumption = 2; // 蓝耗
    private static int attack = 3; // 武器的攻击力
    private static String weaponName = "火焰机枪"; // 武器名
    
    public FlameGun(String weaponName, boolean isCatch) {
        super(weaponName, isCatch, shootBufferTime, blueConsumption, attack);
        this.isCatch = isCatch;
        setImage("weapon/火焰机枪.png");
    }
}
