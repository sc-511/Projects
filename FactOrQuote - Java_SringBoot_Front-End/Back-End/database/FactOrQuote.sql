BEGIN TRANSACTION;

DROP TABLE IF EXISTS facts;
DROP TABLE IF EXISTS quotes;

DROP SEQUENCE IF EXISTS seq_fact_id;
DROP SEQUENCE IF EXISTS seq_quote_id;

CREATE SEQUENCE seq_fact_id
       INCREMENT BY 1
       NO MAXVALUE
       NO MINVALUE
       CACHE 1;
       
CREATE SEQUENCE seq_quote_id
        INCREMENT BY 1
       NO MAXVALUE
       NO MINVALUE
       CACHE 1;
       
CREATE TABLE facts (
        fact_id int DEFAULT nextval('seq_fact_id'::regclass) NOT NULL,
        fact_desc varchar(100000) NOT NULL,
        CONSTRAINT PK_facts PRIMARY KEY (fact_id)
);

CREATE TABLE quotes (
        quote_id int DEFAULT nextval('seq_quote_id'::regclass) NOT NULL,
        quote_desc varchar(100000) NOT NULL,
        CONSTRAINT PK_quote PRIMARY KEY (quote_id)
);

--fact table data
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'Solid Snake and Big Boss being father and son is basically Metal Gear Solid’s “Darth Vader is Luke’s father.” Not in the sense that it’s a life changing twist for the main character, but rather that just about everybody knows it’s the case without even needing to play a single game in the series. MGS is a franchise about legacy so of course Big Boss and Solid Snake are related. Surprisingly enough, though, it’s actually a retcon.')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'You know how fans basically cried for years because Solid Snake was only playable for one short section of Metal Gear Solid 2? Well, originally, the Tanker was going to have some more content to let fans fool with Snake just a little bit longer. At the end of the Tanker, after the whole ship starts to sink, players would have controlled Snake during his escape. Unfortunately, play testplaytestersima’s team, found the whole ordeal to be rather boring. For the sake of pacing, and keeping the game fun all around, they removed the segment. Sure, it’s more Solid Snake, but more isn’t always better.')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'Not only was Metal Gear Solid 4 polarizing with fans, it was also polarizing with its staff. Instead of Solid Snake finding the will to live and deciding to enjoy his remaining months, however few they may be, after reuniting with Big Boss, Kojima intended Snake and Otacon to turn themselves in as terrorists in order to be executed in the game’s big finish. Naturally, the entire staff rejected this idea and outright refused to work unless Kojima agreed to drop the ending. If you’ve ever wondered why “Here’s to You” plays over the credits, this dark fact is why.')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'Kojima Was Not Allowed To Talk To His Staff While Developing MGSV.')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'Konami Banned Kojima From TGA 2015')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'No one can deny that David Hayter truly loves Metal Gear Solid. When it came time to record dialogue for The Twin Snakes, the Gamecube’s remake of Metal Gear Solid, Hayter ended up giving up a good chunk of his salary just to get the old cast back together. As legend goes, David Hayter supposedly gave up half of his entire paycheck since the old audio recording for the PlayStation release were basically unusable. Considering how he was unceremoniously let go for The Phantom Pain, this fact stings all the worse doesn’t it?')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'In the PlayStation 2 version of Metal Gear Solid 3: Snake Eater, and only the PlayStation 2 version, players can access a mini-game called “Guy Savage” where Big Boss, after being attacked, has a nightmare about a man tearing his way through what appears to be zombies. The sequence is fully playable with unique controls independent of Snake Eater.')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'Metal Gear Solid 3 Easily Could Have Ended The Series')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'As if the reunion between Solid Snake and Big Boss at the end of Metal Gear Solid 4 couldn’t be more emotional, the Japanese version of Guns of the Patriots goes one step further by casting Akio Ohtsuka’s father, Chikao Ohtsuka, as Big Boss. Supposedly, the two had a slightly strained relationship, and this casting was done by Kojima as a means of allowing the father and son to reconcile. If you ever get a chance to experience the Japanese dub of MGS4, keep that in mind and weep your eyes out as you watch a son hold his father for the first and last time.')
        ;
INSERT INTO facts (fact_id, fact_desc)
        VALUES (DEFAULT, 'Everyone’s least favorite character from The Phantom Pain, albeit the only one with a discernible arc, Huey was meant to have an even larger role in the game’s story. In an interview with Famitsu, Kenji Yano, an editor and close friend of Kojima’s, explained that Huey would have originally played Ishamael’s role in the narrative. Considering his portrayal in Peace Walker, and his role as Big Boss’ Otacon, this idea makes quite a bit of sense. In many ways, Otacon was Solid Snake’s Ishmael after all. For whatever reason, though, Kojima cut the concept entirely and simply made Ishmael Big Boss. One has to wonder how the game would have played out with Huey effectively taking center stage, though.')
        ;
--quote table data
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'PSYCHO MANTIS: This is the first time I’ve used my powers to help someone. It’s strange… It feels kind of … nice…  -Metal Gear Solid (1998)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'SOLID SNAKE: So patriotism is your excuse for circumventing the Constitution? –Metal Gear Solid (1998)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'OTACON: I realized that you can’t just wish for a happy family — you have to make it happen. I only wish I knew that sooner. –Metal Gear Solid 2: Sons of Liberty (2001)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'SOLID SNAKE: You can stop being part of a mistake, starting now. –Metal Gear Solid 2: Sons of Liberty (2001)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'SOLIDUS SNAKE: We are all born with an expiration date. No one lasts forever. Life is but a grace period for turning the best of our genetic material into the next generation. –Metal Gear Solid 2: Sons of Liberty (2001)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'RAIDEN: I’ll pick my own name, and my own life. I’ll find something worth passing on. –Metal Gear Solid 2: Sons of Liberty (2001)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'THE SORROW: Death is tragic, but life is miserable. –Metal Gear Solid 3: Snake Eater (2004)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'THE BOSS: The foibles of politics and the march of time can turn friends into enemies just as easily as the wind changes. Ridiculous, isn’t it? –Metal Gear Solid 3: Snake Eater (2004)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'BIG BOSS: It’s not about changing the world. It’s about doing our best to leave the world the way it is. It’s about respecting the will of others and believing in your own. –Metal Gear Solid 4: Guns of the Patriots (2008)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'BIG BOSS: Pain gets the better of us all. –Metal Gear Solid: Peace Walker (2010)')
        ;
INSERT INTO quotes (quote_id, quote_desc)
        VALUES (DEFAULT, 'BIG BOSS: Real heroes are never as polished as the legends that surround them. –Metal Gear Solid: Peace Walker (2010)')
        ;

-- testing the data
SELECT *
FROM facts
;

SELECT * 
FROM quotes
;