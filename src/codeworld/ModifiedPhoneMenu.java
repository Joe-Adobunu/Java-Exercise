package codeworld;

import java.util.Scanner;

public class ModifiedPhoneMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
                Enter a number
                """);
        int userInput = input.nextInt();

        while (true) {
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
                            Press -1 Back
                            """);
                    int phoneBook = input.nextInt();
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
                            System.out.println("""
                                    ---------------
                                    Options
                                    ===============
                                    1. Type of View
                                    2. Memory Status
                                    """);
                            int options = input.nextInt();
                            switch (options) {
                                case 1:
                                    System.out.println("Type of View");
                                case 2:
                                    System.out.println("Memory Status");
                                    break;
                                default:
                            }
                        case 9:
                            System.out.println("Speed Dials");
                        case 10:
                            System.out.println("Voice Tags");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;

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
                            press -1 Back
                            """);
                    int message = input.nextInt();
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
                            int messageSettings = input.nextInt();
                            switch (messageSettings) {
                                case 1:
                                    System.out.println("set 1");
                                    System.out.println("""
                                            press 1 message center number
                                            press 2 sent as
                                            press 3 message validity
                                            """);
                                    int set1 = input.nextInt();
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
                                    int common = input.nextInt();
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
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;

                    }

                case 3:
                    System.out.println("""
                            press 1 chat
                            press -1 Back
                            """);
                    int chat = input.nextInt();
                    switch (chat) {
                        case 1:
                            System.out.println("chat");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;

                        default:
                            System.out.println("return");
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
                            press -1 Back
                            """);
                    int callRegister = input.nextInt();
                    switch (callRegister) {
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
                            int showCallDuration = input.nextInt();
                            switch (showCallDuration) {
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
                            int showCallCost = input.nextInt();
                            switch (showCallCost) {
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
                            int callsCostSettings = input.nextInt();
                            switch (callsCostSettings) {
                                case 1:
                                    System.out.println("call cost limit");
                                case 2:
                                    System.out.println("show costs in");
                            }
                        case 8:
                            System.out.println("prepaid credit");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;
                        default:
                            System.out.println("Return");
                    }
                case 5:
                    System.out.println("""
                            --------------
                            Tones
                            ==============
                            press 1. Ringing tone
                            press 2. Ringing volume
                            press 3. Incoming call alert
                            press 4. Composer
                            press 5. Message alert tone
                            press 6. Keypad tones
                            press 7. Warning and game tones
                            press 8. Vibrating alert
                            press 9. Screen save
                            press -1 Back                        
                            """);
                    int tones = input.nextInt();
                    switch (tones) {
                        case 1:
                            System.out.println("Ringing tone");
                        case 2:
                            System.out.println("Ringing volume");
                        case 3:
                            System.out.println("incoming call alert");
                        case 4:
                            System.out.println("Composer");
                        case 5:
                            System.out.println("Message alert tone");
                        case 6:
                            System.out.println("Keypad tones");
                        case 7:
                            System.out.println("Warning and game tones");
                        case 8:
                            System.out.println("Vibrating alert");
                        case 9:
                            System.out.println("Screen save");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;

                    }
                case 6:
                    System.out.println("""
                            -------------
                            Settings
                            =============
                            press 1. Call settings
                            press 2. Phone settings
                            press 3. Security settings
                            press 4. Restore factory settings
                            press -1 Back
                            """);
                    int settings = input.nextInt();
                    switch (settings) {
                        case 1:
                            System.out.println("Call settings");
                            System.out.println("""
                                    press 1. Automatic redial
                                    press 2. Speed dialling
                                    press 3. Call waiting options
                                    press 4. Own number sending
                                   press 5. Phone line in use
                                    press 6. Automatic answer
                                    press -1 Back
                                                                   
                                    """);
                            int callSettings = input.nextInt();
                            switch (callSettings) {
                                case 1:
                                    System.out.println("Automatic redial");
                                case 2:
                                    System.out.println("Speed dialling");
                                case 3:
                                    System.out.println("Call waiting options");
                                case 4:
                                    System.out.println("Own number sending");
                                case 5:
                                    System.out.println("Phone line in use");
                                case 6:
                                    System.out.println("Automatic answer");
                                case -1:
                                    System.out.println("Going back to main menu");
                                    continue;


                            }
                        case 2:
                            System.out.println("phone settings");
                            System.out.println("""
                                    ---------------
                                    Phone settings
                                    ===============
                                    press 1. Language
                                    press 2. Cell info display
                                    press 3. Welcome note
                                    press 4. Network selection
                                    press 5. Lights2
                                    press 6. Confirm SIM service actions
                                    press -1 Back
                                    """);
                            int phoneSettings = input.nextInt();
                            switch (phoneSettings) {
                                case 1:
                                    System.out.println("Language");
                                case 2:
                                    System.out.println("Cell info display");
                                case 3:
                                    System.out.println("Welcome note");
                                case 4:
                                    System.out.println("Network selection");
                                case 5:
                                    System.out.println("Lights");
                                case 6:
                                    System.out.println("Confirm SIM service actions");
                                case -1:
                                    System.out.println("Going back to main menu");
                                    continue;
                            }
                        case 3:
                            System.out.println("Security settings");
                            System.out.println("""
                                    press 1. PIN code request
                                    press 2. Call barring service
                                    press 3. Fixed dialling
                                    press 4. Closed user group
                                    press 5. Phone security
                                    press 6. Change access codes
                                    press -1 Back
                                    """);
                            int securitySettings = input.nextInt();
                            switch (securitySettings) {
                                case 1:
                                    System.out.println("PIN code request");
                                case 2:
                                    System.out.println("Call barring service");
                                case 3:
                                    System.out.println("Fixed dialling");
                                case 4:
                                    System.out.println("Closed user group");
                                case 5:
                                    System.out.println("Phone security");
                                case 6:
                                    System.out.println("Change access codes");
                            }
                        case 4:
                            System.out.println("Restore factory settings");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;

                    }
                case 7:
                    System.out.println("press 1. Call divert");
                    System.out.println("press -1 Back");
                    int callDivert = input.nextInt();
                    switch (callDivert) {
                        case 1:
                            System.out.println("Call Divert");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;

                    }
                case 8:
                    System.out.println("games");
                    System.out.println("press -1 Back");
                case -1:
                    System.out.println("Going back to main menu");
                    continue;


                case 9:
                    System.out.println("Calculator");
                    break;
                case 10:
                    System.out.println("Reminders");
                    break;

                case 11:
                    System.out.println("Clock");
                    System.out.println("""
                            press 1. Alarm clock
                            press 2. Alarm clock
                            press 3. Date setting
                            press 4. Stopwatch
                            press 5. Countdown timer
                            press 6. Auto update of date and time
                            press -1 Back
                            """);
                    int clock = input.nextInt();
                    switch (clock) {
                        case 1:
                            System.out.println("Alarm clock");
                        case 2:
                            System.out.println("Alarm clock");
                        case 3:
                            System.out.println("Date setting");
                        case 4:
                            System.out.println("Stopwatch");
                        case 5:
                            System.out.println("Countdown timer");
                        case 6:
                            System.out.println("Auto update of date and time");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;

                    }
                case 12:
                    System.out.println("Profile");
                    System.out.println("press -1 Back");
                    int profile = input.nextInt();
                    switch (profile){
                        case 1:
                        System.out.println("profile");
                        case -1:
                            System.out.println("Going back to main menu");
                            continue;
                    }

                case 13:
                    System.out.println("SIM services");
                    System.out.println("press -1 Back");
                    int simService = input.nextInt();
                    switch (simService){
                        case 1:
                            System.out.println("Sim service");
                        case -1:
                            System.out.println("Going back to main menu");

                    }
            }


        }

    }

}




