package com.indytskyi;

import com.ginsberg.junit.exit.ExpectSystemExit;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class BattleTest {

    @Test
    @ExpectSystemExit
    public void testPlayingGameWithoutAnyExceptions() {
        String mockConsole = """
            A1 A5
            C1 C4
            E1 E3
            G1 G3
            I1 I2
            A1 A5
            C1 C4
            E1 E3
            G1 G3
            I1 I2
            A1 A1
            A2 A2 A3 A3 A4 A4 A5 A5
            C1 A6 C2 A7 C3 C1 C4 C4
            E1 E6 E2 E7 E3 E3
            G1 G1 G3 G3 G2 G7
            I1 I1 I2 I2
         
            """;
        //GIVEN
        ByteArrayInputStream in = new ByteArrayInputStream(mockConsole.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setIn(in);
        System.setOut(ps);
        Battle battle = new Battle(new GameShips());

        //WHEN
        battle.initializationOfShips();
    }

    @Test
    @ExpectSystemExit
    public void testThrowingExceptionsIfUsersInputIncorrectCoordinatesOfFire() {
        String mockConsole = """
            A1 A5
            C1 C4
            E1 E3
            G1 G3
            I1 I2
            A1 A5
            C1 C4
            E1 E3
            G1 G3
            I1 I2
            ФФ
            A1 A1
            A1
            A2 A2 A3 A3 A4 A4 A5 A5
            C1 A6 C2 A7 C3 C1 C4 C4
            E1 E6 E2 E7 E3 E3
            G1 G1 G3 G3 G2 G7
            I1 I1 I2 I2
         
            """;
        //GIVEN
        ByteArrayInputStream in = new ByteArrayInputStream(mockConsole.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setIn(in);
        System.setOut(ps);
        Battle battle = new Battle(new GameShips());

        //WHEN
        battle.initializationOfShips();
    }


    @Test
    @ExpectSystemExit
    public void testThrowingExceptionsIfUsersInputIncorrectLocationOfShips() {
        String mockConsole = """
            A1 A6
            Q1 Q2
            A11 A13
            B4 A4
            
            A1 A5

            A6 A9
            B6 B9
            A1 D1
            C1 C4
            E1 E3
            G1 G3
            I1 I2
            A1 A5
            C1 C4
            E1 E3
            G1 G3
            I1 I2
            
            A1 A1
            A2 A2 A3 A3 A4 A4 A5 A5
            C1 A6 C2 A7 C3 C1 C4 C4
            E1 E6 E2 E7 E3 E3
            G1 G1 G3 G3 G2 G7
            I1 I1 I2 I2

            """;
        //GIVEN
        ByteArrayInputStream in = new ByteArrayInputStream(mockConsole.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setIn(in);
        System.setOut(ps);
        Battle battle = new Battle(new GameShips());

        //WHEN
        battle.initializationOfShips();
    }

}