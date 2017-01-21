package mahmud.rifatmahmud.com.facebook.amazing_facts;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String[] myDataset;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tough();
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
        final RelativeLayout r = (RelativeLayout) findViewById(R.id.rel);
        r.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    ColorDrawable[] color = {new ColorDrawable(Color.RED), new ColorDrawable(Color.GREEN)};
                    TransitionDrawable trans = new TransitionDrawable(color);
                    r.setBackground(trans);
                    trans.startTransition(3000); // duration 3 seconds
                    i = 1;
                } else if (i == 1) {
                    ColorDrawable[] color = {new ColorDrawable(Color.GREEN), new ColorDrawable(Color.RED)};
                    TransitionDrawable trans = new TransitionDrawable(color);
                    r.setBackground(trans);
                    trans.startTransition(3000); // duration 3 seconds
                    i = 2;

                } else if (i == 2) {
                    ColorDrawable[] color = {new ColorDrawable(Color.RED), new ColorDrawable(Color.BLUE)};
                    TransitionDrawable trans = new TransitionDrawable(color);
                    r.setBackground(trans);
                    trans.startTransition(3000); // duration 3 seconds
                    i = 3;

                } else if (i == 3) {
                    ColorDrawable[] color = {new ColorDrawable(Color.DKGRAY), new ColorDrawable(Color.WHITE)};
                    TransitionDrawable trans = new TransitionDrawable(color);
                    r.setBackground(trans);
                    trans.startTransition(3000); // duration 3 seconds
                    i = 0;

                }
            }

        });

    }


    private void tough() {
        myDataset = new String[]{
                "The time difference between when Stegosaurus and Tyrannosaurus lived is greater than the time difference between Tyrannosaurus and now.\n",
                "The time difference between when The Waltons aired and now is about as great as the time difference when The Waltons was set (FDR presidency) and when it aired.\n",
                "If you properly shuffle a deck of cards, in all likelihood, the resulting deck has never been seen before in the history of the world.\n",
                "The bushes in Super Mario Bros. were just recolored clouds.\n", "•There is a blind guy who can ride his bike in traffic using echolocation.\n",
                "There is a species of jellyfish that is immortal (turritopsis nutricula).\n", "•History of Computer Symbols.\n",
                "A small enough animal can fall at terminal velocity without suffering any injury upon impact. An ant (or even a smallish spider) dropped from a tall building will be just fine.",
                "If you could fold a piece of paper in half 50 times, its thickness will be 3/4 the distance from the Earth to the Sun (71 million miles).\n",
                "Over 3 billion people live on less than $2.50 a day (in USD using purchasing parity power), roughly half of the world's population.\n",
                "There are more cells of bacteria in your body than there are human cells. (Indeed, there are more cells of E. coli alone than of human cells.)\n",
                "Computer hardware has fulfilled Moore's Law for 40 years and may continue to do so.\n",
                "The guidance computer from the Apollo 11 mission ran at 1.024 MHz, about 1/6th of the processing power of a TI-83 Calculator, and it took human beings to the moon.\n",
                "Humans landed on the moon, and it happened over 40 years ago.\n",
                "When you see most stars, you're essentially looking hundreds or thousands of years into the past.\n",
                "It takes a photon, on average, 200,000 years to travel from the core of the Sun to the surface, then just a little over 8 minutes from the Sun's surface to your eyeball, sliding in at 1,100,000,000km/h.\n",
                "If you cut up a hologram, the entire image is retained in each piece.\n",
                "If Earth weren't tilted on its axis, we wouldn't have woodgrain, just \"tree brown\".\n",
                "Boston Red Sox slugger Ted Williams missed almost five full baseball seasons (1943, 1944, 1945, 1952 and 1953) fighting as a fighter pilot in World War II and the  Korean War and still managed to hit 521 home runs.",
                "A pencil has the potential to draw a line 38 miles long.\n",
                "During metamorphosis, what happens in a cocoon is that most of the caterpillar gets dissolved by enzymes into a soup of undifferentiated cells and then the butterfly grows out of the same DNA.\n",
                "In the 200,000 years since Homo Sapiens took their first steps across the African plains, just 57 billion people have ever lived -- meaning over 12% of all the people ever born are 'walking' the planet at this very moment\n",
                "1 sperm has 37.5MB of DNA information in it. That means a normal ejaculation represents a data transfer of 1587GB in about 3 seconds\n",
                "Pixar Movies: The A113 Easter Egg, The Pizza Planet truck and the next Pixar movie are hidden in their films\n",
                "The Earth's diameter is about 3mm larger than its circumference divided by pi [ How could one ever measure the earth to such accuracy? Especially considering that it's not smooth as glass..]\n",
                "The major religion in Antarctica is Christianity with a total of 8 churches.\n",
                "You live in the past. Use one hand to touch your nose, and the other to touch one of your feet, at exactly the same time. You will experience them as simultaneous acts. Clearly it takes more time for the signal to travel up your nerves from your feet to your brain than from your nose. The reconciliation is simple: our conscious experience takes time to assemble, and your brain waits for all the relevant input before it experiences the “now.” Experiments have shown that the lag between things happening and us experiencing them is about 80 milliseconds.\n",
                "Every day, 16% of the searches that occur are ones that Google has never seen before.\n",
                "Canadian amputee Terry Fox ran a marathon every day for 143 days straight, before dying of cancer at age 21. As a result, $500M has been raised in his name for cancer awareness.\n",
                "There is actually a disease called Alien hand syndrome, in which the person with AHS has no conscious control over his 'alien hand' and will blurt things out like: \"I swear I'm not doing this\".\n",
                "The Emerald Cockroach Wasp disables the escaping reflex of cockroaches, leads them to its burrow by pulling their antennae, lays a 2mm white egg into their abdomen and buries them. Then the wasp larvae eat the roaches organs keeping them alive for 8 days until they enter pupal stage. Eventually adult wasps emerge from the cockroaches abdomen.\n",
                "Of the almost 163 current member states of the United Nations, the British have, at some point in history, invaded and established a military presence in 171 of them.",
                "",
                " The longest time between two twins being born is 87 days.\n" +
                        " The world’s deepest postbox is in Susami Bay in Japan. It’s 10 metres underwater.\n" +
                        " In 2007, an American man named Corey Taylor tried to fake his own death in order to get out of his cell phone contract without paying a fee. It didn’t work.\n" +
                        " The oldest condoms ever found date back to the 1640s (they were found in a cesspit at Dudley Castle), and were made from animal and fish intestines.\n" +
                        " In 1923, jockey Frank Hayes won a race at Belmont Park in New York despite being dead — he suffered a heart attack mid-race, but his body stayed in the saddle until his horse crossed the line for a 20–1 outsider victory.\n" +
                        " Everyone has a unique tongue print, just like fingerprints.\n" +
                        " Most Muppets are left-handed. (Because most Muppeteers are right-handed, so they operate the head with their favoured hand.)\n" +
                        " Female kangaroos have three vaginas.\n" +
                        " It costs the U.S. Mint almost twice as much to mint each penny and nickel as the coins are actually worth. Taxpayers lost over $100 million in 2013 just through the coins being made.\n" +
                        " Light doesn’t necessarily travel at the speed of light. The slowest we’ve ever recorded light moving at is 38 mph.\n" +
                        " Casu marzu is a Sardinian cheese that contains live maggots. The maggots can jump up to five inches out of cheese while you’re eating it, so it’s a good idea to shield it with your hand to stop them jumping into your eyes.\n" +
                        " The loneliest creature on Earth is a whale who has been calling out for a mate for over two decades — but whose high-pitched voice is so different to other whales that they never respond.\n" +
                        " The spikes on the end of a stegosaurus’ tail are known among paleontologists as the “thagomizer” — a term coined by cartoonist Gary Larson in a 1982 Far Side drawing.\n" +
                        " During World War II, the crew of the British submarine HMS Trident kept a fully grown reindeer called Pollyanna aboard their vessel for six weeks (it was a gift from the Russians).\n" +
                        " The northern leopard frog swallows its prey using its eyes — it uses them to help push food down its throat by retracting them into its head.\n" +
                        " The first man to urinate on the moon was Buzz Aldrin, shortly after stepping onto the lunar surface.\n" +
                        " Some fruit flies are genetically resistant to getting drunk — but only if they have an inactive version of a gene scientists have named “happyhour”.\n" +
                        " Experiments show that male rhesus macaque monkeys will pay to look at pictures of female rhesus macaques’ bottoms.\n" +
                        " In 1567, the man said to have the longest beard in the world died after he tripped over his beard running away from a fire.\n" +
                        " The Dance Fever of 1518 was a month-long plague of inexplicable dancing in Strasbourg, in which hundreds of people danced for about a month for no apparent reason. Several of them danced themselves to death.\n" +
                        " Vladimir Nabokov nearly invented the smiley.\n" +
                        " In 1993, San Francisco held a referendum over whether a police officer called Bob Geary was allowed to patrol while carrying a ventriloquist’s dummy called Brendan O’Smarty. He was.\n" +
                        " Sigurd the Mighty, a ninth-century Norse earl of Orkney, was killed by an enemy he had beheaded several hours earlier. He’d tied the man’s head to his horse’s saddle, but while riding home one of its protruding teeth grazed his leg. He died from the infection.\n" +
                        " The Dutch village of Giethoorn has no roads; its buildings are connected entirely by canals and footbridges.\n" +
                        " A family of people with blue skin lived in Kentucky for many generations. The Fulgates of Troublesome Creek are thought to have gained their blue skin through combination of inbreeding and a rare genetic condition known as methemoglobinemia.\n" +
                        " Powerful earthquakes can permanently shorten the length of Earth’s day, by moving the spin of the Earth’s axis. The 2011 Japan earthquake knocked 1.8 microseconds off our days. The 2004 Sumatra quake cost us around 6.8 microseconds.\n" +
                        " The first American film to show a toilet being flushed on screen was Alfred Hitchcock’s Psycho.\n" +
                        " Melting glaciers and icebergs make a distinctive fizzing noise known as “bergy seltzer”.\n" +
                        " There is a glacier called “Blood Falls” in Antarctica that regularly pours out red liquid, making it look like the ice is bleeding. (It’s actually oxidised salty water.)\n" +
                        " In 2008 scientists discovered a new species of bacteria that lives in hairspray.\n" +
                        " The top of the Eiffel Tower leans away from the sun, as the metal facing the sun heats up and expands. It can move as much as 7 inches.\n" +
                        " Lt. Col. “Mad” Jack Churchill was only British soldier in WWII known to have killed an enemy soldier with a longbow. “Mad Jack” insisted on going into battle armed with both a medieval bow and a claymore sword.\n" +
                        " A U.S. park ranger named Roy C. Sullivan held the record for being struck by lightning the most times, having been struck — and surviving — seven times between 1942 and 1977. He died of a self-inflicted gunshot in 1983.\n" +
                        " The longest musical performance in history is currently taking place in the church of St. Burchardi in Halberstadt, Germany. The performance of John Cage’s “Organ²/ASLSP (As Slow As Possible)” started on Sept. 5, 2001, and is set to finish in 2640. The last time the note changed was October 2013; the next change isn’t due until 2020.\n" +
                        " There’s an opera house on the U.S.–Canada border where the stage is in one country and half the audience is in another.\n" +
                        " The tiny parasite Toxoplasma gondii can only breed sexually when in the guts of a cat. To this end, when it infects rats, it changes their behaviour to make them less scared of cats.\n" +
                        " The katzenklavier (“cat piano”) was a musical instrument made out of cats. Designed by 17th-century German scholar Athanasius Kircher, it consisted of a row of caged cats with different voice pitches, who could be “played” by a keyboardist driving nails into their tails.\n" +
                        " There is a single mega-colony of ants that spans three continents, covering much of Europe, the west coast of the U.S., and the west coast of Japan.\n" +
                        " The largest snowflake ever recorded reportedly measured 15 inches across.\n" +
                        " An epidemic of laughing that lasted almost a year broke out in Tanganyika (now Tanzania) in 1962. Several thousand people were affected, across several villages. It forced a school to close. It wasn’t fun, though — other symptoms included crying, fainting, rashes, and pain.\n" +
                        " The Romans used to clean and whiten their teeth with urine. Apparently it works. Please don’t do it, though.\n" +
                        " There are around 60,000 miles of blood vessels in the human body. If you took them all out and laid them end to end, they’d stretch around the world more than twice. But, seriously, don’t do that either.\n",
                "", "!!!  BONUS for you !!!",
                "Waiting !!!\n" +
                        "\n" +
                        "Waiting at least 24 hours before making a big decision that will likely determine the course of your life:\n" +
                        "\n" +
                        "Got a job offer? Don't make a decision yet. Wait for 24 hours and think over it. Don't be impulsive! This is a big deal choice.\n" +
                        "\n" +
                        "Got fired? Wait for 24 hours and think what happened and what is your next best step. Don't rush to call the next recruiter that pops up on your job search.\n" +
                        "\n" +
                        "Are you very angry at your partner because of a big fight? Is your relationship struggling? Don't tell them immediately that you want to break up. Wait for at least 24 hours and think about it: is a breakup really what you truly want?\n" +
                        "\n" +
                        "Are you almost going to yell at your incompetent coworker? Don't do it yet! Wait for 24 hours before damaging your relationship with your colleague. Think it over and devise a plan on how to discuss things over.\n" +
                        "\n" +
                        "My point is that a lot of times in our lives we are driven by our impulses and that we make decisions driven by a moment’s emotion. Countless of regrets follow because of impulsivity, life changes not for the better , relationships are broken, misery and frustration can conquer your psychological well-being.\n" +
                        "\n" +
                        "So please wait for a while before you tell your partner it's over, wait for a while before you yell at your colleague, wait for a while before immediately committing to that job offer.\n" +
                        "\n" +
                        "While thinking things by waiting doesn't necessarily mean that your life choices and outcomes will be the best, at least you tried and considered all of the possibilities. You deeply and genuinely thought about whatever major issues life has thrown at you, and you are sure there will be no regrets over the coming decision. So spare yourself some hardship, regret, tears, and insecurity by waiting. You can do it: you can wait!!\n" +
                        "\n" +
                        "Hope this helps.",
                "",


        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }

    public void intent(MenuItem item) {
        Uri uri = Uri.parse("http://facebook.com/theabnp");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        this.startActivity(intent);


    }


    public void toast(MenuItem item) {

//        LayoutInflater l = getLayoutInflater();
        View lay = getLayoutInflater().inflate(R.layout.toast,
                (ViewGroup) findViewById(R.id.custom));
        final Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
        toast.setView(lay);
        toast.show();

        new CountDownTimer(7000, 1000)
        {

            public void onTick(long millisUntilFinished) {toast.show();}
            public void onFinish() {toast.show();}

        }.start();
    }
}

