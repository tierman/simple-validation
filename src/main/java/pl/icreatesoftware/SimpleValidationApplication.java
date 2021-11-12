package pl.icreatesoftware;

import pl.icreatesoftware.dto.Flower;
import pl.icreatesoftware.dto.FlowerType;
import pl.icreatesoftware.dto.Flowerpot;
import pl.icreatesoftware.validation.ValidatorImpl;
import pl.icreatesoftware.validation.rules.ColorRule;
import pl.icreatesoftware.validation.rules.WaterLevelRule;

import java.time.LocalDateTime;

public class SimpleValidationApplication {

    public static void main(String[] args) {
        var flower = Flower.of("Tulip", LocalDateTime.now(), "YELLOW", FlowerType.TULIP);
        var flowerPot = Flowerpot.of(10, 3);
        var flowerPot2 = Flowerpot.of(20, 20);

        var flowerResult = ValidatorImpl.of(flower).check(ColorRule.of(flower));
        var flowerPotResult = ValidatorImpl.of(flowerPot).check(WaterLevelRule.of(flowerPot));
        var flowerPot2Result = ValidatorImpl.of(flowerPot2).check(WaterLevelRule.of(flowerPot2));

        System.out.println("\nResult:\n");
        System.out.println("\nflower: " + flowerResult);
        System.out.println("\nflowerPotResult: " + flowerPotResult);
        System.out.println("\nflowerPot2Result: " + flowerPot2Result);
    }
}
