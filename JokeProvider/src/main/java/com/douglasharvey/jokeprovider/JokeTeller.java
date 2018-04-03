package com.douglasharvey.jokeprovider;

//source https://thoughtcatalog.com/brandon-gorrell/2015/03/50-short-clean-jokes-and-puns-that-will-get-a-laugh-every-time/

public class JokeTeller {
    private final String[] jokes = new String[] {"What did the Buddhist ask the hot dog vendor? \n\n'Make me one with everything.'",
            "You know why you never see elephants hiding up in trees? \n\nBecause they're really good at it.",
            "What is red and smells like blue paint? \n\nRed paint.",
            "A dyslexic man walks into a bra.",
            "Where does the General keep his armies? \n\nIn his sleevies!",
            "Why aren't koalas actual bears? \n\nThe don't meet the koalafications.",
            "A bear walks into a restaurant and say's 'I want a grilllllled………………………………………cheese.' The waiter says 'Whats with the pause?' \n\nThe bear replies 'Whaddya mean, I'M A BEAR.'",
            "What do you call bears with no ears? \n\nB",
            "Why dont blind people skydive? \n\nBecause it scares the crap out of their dogs.",
            "I went in to a pet shop. I said, 'Can I buy a goldfish?' The guy said, 'Do you want an aquarium?' \n\nI said, 'I don't care what star sign it is.'",
            "What do you get when you cross a dyslexic, an insomniac, and an agnostic? \n\nSomeone who lays awake at night wondering if there is a dog.",
            "A pirate walks into a bar with a steering wheel on his pants, a peg leg and a parrot on his shoulder. The bartender says, 'Hey, you've got a steering wheel on your pants.' \nThe pirate says, 'Arrrr, I know. It's driving me nuts.'",
            "I saw a wino eating grapes. \n\nI told him, you gotta wait. (Mitch Hedberg)",
            "What's brown and sticky? \n\nA stick.",
            "What does a pepper do when it's angry? \n\nIt gets jalapeno face!",
            "What's a foot long and slippery? \n\nA slipper.",
            "Two gold fish are in a tank. \n\nOne looks at the other and says, 'You know how to drive this thing?!'",
            "Two soldiers are in a tank. \n\nOne looks at the other and says, 'BLUBLUBBLUBLUBBLUB.'",
            "As a scarecrow, people say I'm outstanding in my field. \n\nBut hay, it's in my jeans.",
            "A man is walking in the desert with his horse and his dog when the dog says, 'I can't do this. I need water.' The man says, 'I didn't know dogs could talk.' \n\nThe horse says, 'Me neither!'",
            "A guy goes into a lawyer's office and asks the lawyer: 'Excuse me, how much do you charge?' \n\nThe lawyer responds: 'I charge $1,000 to answer three questions.' 'Bloody hell - That's a bit expensive isn't it?' 'Yes. What's your third question?'",
            "What is the resemblance between a green apple and a red apple? \n\nThey're both red except for the green one.",
            "I have an EpiPen. \n\nMy friend gave it to me when he was dying, it seemed very important to him that I have it.",
            "How did the hipster burn his mouth? \n\nHe ate the pizza before it was cool.",
            "What's the difference between an oral thermometer and a rectal thermometer? \n\nThe taste.",
            "An atheist, a Crossfitter, and a vegan walk into a bar. \n\nI know because they told me.",
            "I waited and stayed up all night and tried to figure out where the sun was. \n\nThen it dawned on me.",
            "I told my friend 10 jokes to get him to laugh. \n\nSadly, no pun in 10 did.",
            "What's red and moves up and down? \n\nA tomato in an elevator",
            "I bought the world's worst thesaurus yesterday. \n\nNot only is it terrible, it's terrible.",
            "Why can't you hear a pterodactyl go to the bathroom? \n\nBecause the 'P' is silent!",
            "My roommate told me my clothes look gay. \n\nI was like, don't be a dick dude; they just came out of the closet.",
            "How did the blonde die ice fishing? \n\nShe was hit by the zamboni.",
            "How Long is a Chinese man's name. \n\nNo, it actually is.",
            "How does NASA organize a party? \n\nThey planet.",
            "Knock Knock. \n\nWho's There? \n\nTo. \n\nTo Who? \n\nIt's To Whom.",
            "What's a pirates favorite letter? \n\nYou think it's R but it be the C.",
            "Have you heard about corduroy pillows? \n\nThey're making headlines.",
            "What did the green grape say to the purple grape? \n\nOMG!!!!!!! BREATHE!! BREATHEEEEE!!!!!",
            "Never criticize someone until you have walked a mile in their shoes. \n\nThat way, when you criticize them, you'll be a mile away, and you'll have their shoes.",
            "What do Alexander the Great and Winnie the Pooh have in common? \n\nSame middle name.",
            "I couldn't believe that the highway department called my dad a thief. \n\nBut when I got home, all the signs were there.",
            "My grandfather died peacefully, in his sleep... \n\n...not screaming like the passengers in his car.",
            "What did the left eye say to the right eye? \n\nBetween you and me, something smells.",
            "What do Cannon Balls do when they're in love? \n\nMake bbs.",
            "Why did the cowboy get a wiener dog? \n\nHe wanted to get a long little doggie.",
            "If you want to find out who loves you more, stick your wife and dog in the trunk of your car for an hour. \n\nWhen you open the trunk, who is happy to see you?",
            "Sometimes I tuck my knees into my chest and lean forward. \n\nThat's just how I roll.",
            "Cole's Law: Thinly Sliced Cabbage",
            "I intend to live forever. \n\nSo far, so good. (Steve Wright)" };

    public String getRandomJoke(){
        int randomNumber = (int) Math.round(Math.random()*jokes.length)-1;
        return jokes [randomNumber];
    }
}
