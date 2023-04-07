package codeworld;

import java.util.Scanner;

public class PhoneMenu1 {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("""
                Press 1 >>>> Phone Book
                Press 2 >>>> Message
                Press 3 >>>> Chat
                Press 4 >>>>> Call Register
                Press 5 >>>>> Tone
                Press 6 >>>>> Setting
                Press 7 >>>>> Call Divert
                Press 8 >>>>> Games
                Press 9 >>>>> Calculator
                Press 10 >>>> Reminders
                Press 11 >>>>> Clock
                Press 12 >>>>> Profiles
                Press 13 >>>>> SIM service
                """);
        System.out.println("enter a number");
        int userInput = inPut.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("""
                        _________________
                        Phone Book
                        =================
                        press 1 Search
                        press 2 Service
                        press 3 add name
                        press 4 erase
                        press 5 edit
                        press 6 assign
                        press 7 send b'card
                        press 8 options"
                        press 9 Speed Dials
                        press 10 Voice Tags
                        Press -1 Back  """);
                int phoneBook = inPut.nextInt();
                switch (phoneBook) {
                    case 1:
                        System.out.println("Search");
                    case 2:
                        System.out.println("Service");
                    case 3:
                        System.out.println("Add Name");
                    case 4:
                        System.out.println("Erase");
                    case 5:
                        System.out.println("Edit");
                    case 6:
                        System.out.println("Assign");
                    case 7:
                        System.out.println("Send Business Card");
                    case 8:
                        System.out.println("Options");
                        System.out.println("""
                                -------------
                                Options:
                                =============
                                1.type of view
                                2.memory status
                                """);
                        int options = inPut.nextInt();
                        switch (options) {
                            case 1:
                                System.out.println("type of view");
                            case 2:
                                System.out.println("voice tags");
                                break;
                            default:
                                System.out.println("Return");
                        }
                    case 9:
                        System.out.println("Speed Dials");
                    case 10:
                        System.out.println("Voice Tags");

                }
            case 2:
                System.out.println("""
                        ---------------
                        Messages
                        ===============
                        press 1 write message
                        press 2 inbox
                        press 3 outbox
                        press 4 picture messages
                        press 5 templates
                        press 6 smileys
                        press 7 message settings
                        press 8 info service
                        press 9 voice mailbox number
                        press 10 service command editor
                        """);
                int message = inPut.nextInt();
                switch (message) {
                    case 1:
                        System.out.println("write message");
                    case 2:
                        System.out.println("inbox");
                    case 3:
                        System.out.println("outbox");
                    case 4:
                        System.out.println("picture message");
                    case 5:
                        System.out.println("templates");
                    case 6:
                        System.out.println("smileys");
                    case 7:
                        System.out.println("message settings");
                        System.out.println("""
                                press 1 set 1
                                press 2 common
                                """);
                        int messageSettings = inPut.nextInt();
                        switch (messageSettings) {
                            case 1:
                                System.out.println("set 1");
                                System.out.println("""
                                        press 1 message center number
                                        press 2 sent as
                                        press 3 message validity
                                        """);
                                int set1 = inPut.nextInt();
                                switch (set1) {
                                    case 1:
                                        System.out.println("message center number");
                                    case 2:
                                        System.out.println("sent as");
                                    case 3:
                                        System.out.println("message validity");
                                }
                            case 2:
                                System.out.println("common");
                                System.out.println("""
                                        press 1 delivery reports
                                        press 2 reply via same center
                                        press 3 character support
                                        """);
                                int common = inPut.nextInt();
                                switch (common) {
                                    case 1:
                                        System.out.println("delivery reports");
                                    case 2:
                                        System.out.println("reply via same center");
                                    case 3:
                                        System.out.println("character support");

                                }
                        }
                    case 8:
                        System.out.println("info service");
                    case 9:
                        System.out.println("voice mailbox number");
                    case 10:
                        System.out.println("service command editor");
                        break;
                }

            case 3:
                System.out.println("""
                        press 1 chat
                        """);
                int chat = inPut.nextInt();
                switch (chat){
                    case 1:
                        System.out.println("chat");
                        break;
                    default: System.out.println("return");
                }
            case 4:
                System.out.println("""
                        ---------------
                        Call Register
                        ================
                        press 1 missed call
                        press 2 received call
                        press 3 dialed numbers
                        press 4 erase recent call list
                        press 5 show call duration
                        press 6 show call cost
                        press 7 call cost settings
                        press 8 prepaid credit
                        """);
                int callRegister = inPut.nextInt();
                switch (callRegister){
                    case 1:
                        System.out.println("missed call");
                    case 2:
                        System.out.println("received calls");
                    case 3:
                        System.out.println("dialed numbers");
                    case 4:
                        System.out.println("erase recent call list");
                    case 5:
                        System.out.println("show call duration");
                        System.out.println("""
                                press 1 last call duration
                                press 2 all calls duration
                                press 3 received calls duration
                                press 4 dialed calls duration 
                                press 5 clear timers
                                """);
                        int showCallDuration = inPut.nextInt();
                        switch (showCallDuration){
                            case 1:
                                System.out.println("last call duration");
                            case 2:
                                System.out.println("all calls duration");
                            case 3:
                                System.out.println("received calls duration");
                            case 4:
                                System.out.println("dialed calls duration");
                            case 5:
                                System.out.println("clear timers");
                                break;
                        }

                    case 6:
                        System.out.println("show call cost");
                        System.out.println("""
                                press 1 last call cost
                                press 2 all calls cost
                                press 3 clear counter
                                """);
                        int showCallCost = inPut.nextInt();
                        switch (showCallCost){
                            case 1:
                                System.out.println("last call cost");
                            case 2:
                                System.out.println("all calls cost");
                            case 3:
                                System.out.println("clear counter");
                        }

                    case 7:
                        System.out.println("call cost settings");
                        System.out.println("""
                                press 1 call limit
                                press 2 show cost in
                                """);
                        int callsCostSettings = inPut.nextInt();
                        switch (callsCostSettings){
                            case 1:
                                System.out.println("call cost limit");
                            case 2:
                                System.out.println("show costs in");
                        }
                    case 8:
                        System.out.println("prepaid credit");
                        break;
                    default: System.out.println("Return");
                }

        }


        }

}