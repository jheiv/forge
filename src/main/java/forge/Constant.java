/*
 * Forge: Play Magic: the Gathering.
 * Copyright (C) 2011  Forge Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package forge;

import java.util.ArrayList;
import java.util.List;

import forge.deck.Deck;
import forge.game.GameType;
import forge.properties.ForgeProps;
import forge.properties.NewConstants;

/**
 * <p>
 * Constant interface.
 * </p>
 * 
 * @author Forge
 * @version $Id$
 */
public final class Constant {
    /** Constant <code>ProgramName="Forge - http://cardforge.org"</code>. */
    public static final String PROGRAM_NAME = "Forge - " + ForgeProps.getProperty(NewConstants.CARDFORGE_URL);

    // used to pass information between the GUI screens
    /**
     * The Class Runtime.
     */
    public static class Runtime {

        /** The Constant HumanDeck. */
        public static final Deck[] HUMAN_DECK = new Deck[1];

        /** The Constant ComputerDeck. */
        public static final Deck[] COMPUTER_DECK = new Deck[1];

        /** The skin name. */
        private static String skinName = "default";

        /** The game type. */
        private static GameType gameType = GameType.Constructed;

        /** The Constant Smooth. */
        public static final boolean[] SMOOTH = new boolean[1];

        /** The Constant Mill. */
        public static final boolean[] MILL = new boolean[1];

        /** The Constant DevMode. */
        // one for normal mode, one for quest mode
        public static final boolean[] DEV_MODE = new boolean[1];

        /** The Constant NetConn. */
        public static final boolean[] NET_CONN = new boolean[1];

        /** The Constant UpldDrft. */
        public static final boolean[] UPLOAD_DRAFT = new boolean[1];

        /** The Constant RndCFoil. */
        public static final boolean[] RANDOM_FOIL = new boolean[1];

        /** The Constant width. */
        public static final int[] WIDTH = { 300 };

        /** The Constant height. */
        public static final int[] HEIGHT = new int[1];

        /** The Constant stackSize. */
        public static final int[] STACK_SIZE = new int[1];

        /** The Constant stackOffset. */
        public static final int[] STACK_OFFSET = new int[1];

        /**
         * Gets the game type.
         * 
         * @return the gameType
         */
        public static GameType getGameType() {
            return Runtime.gameType;
        }

        /**
         * Sets the game type.
         * 
         * @param gameType0
         *            the gameType to set
         */
        public static void setGameType(final GameType gameType0) {
            Runtime.gameType = gameType0;
        }

        /**
         * Gets the skin name.
         *
         * @return the skin name
         */
        public static String getSkinName() {
            return Runtime.skinName;
        }

        /**
         * Sets the skin name.
         *
         * @param skinName the new skin name
         */
        public static void setSkinName(final String skinName) {
            Runtime.skinName = skinName;
        }
    }

    /**
     * The Interface Phase.
     */
    public static class Phase {

        /** The Constant Untap. */
        public static final String UNTAP = "Untap";

        /** The Constant Upkeep. */
        public static final String UPKEEP = "Upkeep";

        /** The Constant Draw. */
        public static final String DRAW = "Draw";

        /** The Constant Main1. */
        public static final String MAIN1 = "Main1";

        /** The Constant Combat_Begin. */
        public static final String COMBAT_BEGIN = "BeginCombat";

        /** The Constant Combat_Declare_Attackers. */
        public static final String COMBAT_DECLARE_ATTACKERS = "Declare Attackers";

        /** The Constant Combat_Declare_Attackers_InstantAbility. */
        public static final String COMBAT_DECLARE_ATTACKERS_INSTANT_ABILITY = "Declare Attackers - Play Instants and Abilities";

        /** The Constant Combat_Declare_Blockers. */
        public static final String COMBAT_DECLARE_BLOCKERS = "Declare Blockers";

        /** The Constant Combat_Declare_Blockers_InstantAbility. */
        public static final String COMBAT_DECLARE_BLOCKERS_INSTANT_ABILITY = "Declare Blockers - Play Instants and Abilities";

        /** The Constant Combat_Damage. */
        public static final String COMBAT_DAMAGE = "Combat Damage";

        /** The Constant Combat_FirstStrikeDamage. */
        public static final String COMBAT_FIRST_STRIKE_DAMAGE = "First Strike Damage";

        /** The Constant Combat_End. */
        public static final String COMBAT_END = "EndCombat";

        /** The Constant Main2. */
        public static final String MAIN2 = "Main2";

        /** The Constant End_Of_Turn. */
        public static final String END_OF_TURN = "End of Turn";

        /** The Constant Cleanup. */
        public static final String CLEANUP = "Cleanup";
    }

    /**
     * The Enum Zone.
     */
    public enum Zone {

        /** The Hand. */
        Hand,

        /** The Library. */
        Library,

        /** The Graveyard. */
        Graveyard,

        /** The Battlefield. */
        Battlefield,

        /** The Exile. */
        Exile,

        /** The Command. */
        Command,

        /** The Stack. */
        Stack,

        /** Ante. */
        Ante;

        /**
         * Smart value of.
         * 
         * @param value
         *            the value
         * @return the zone
         */
        public static Zone smartValueOf(final String value) {
            if (value == null) {
                return null;
            }
            if ("All".equals(value)) {
                return null;
            }
            final String valToCompate = value.trim();
            for (final Zone v : Zone.values()) {
                if (v.name().compareToIgnoreCase(valToCompate) == 0) {
                    return v;
                }
            }
            throw new IllegalArgumentException("No element named " + value + " in enum Zone");
        }

        /**
         * List value of.
         * 
         * @param values
         *            the values
         * @return the list
         */
        public static List<Zone> listValueOf(final String values) {
            final List<Zone> result = new ArrayList<Constant.Zone>();
            for (final String s : values.split("[, ]+")) {
                result.add(Zone.smartValueOf(s));
            }
            return result;
        }
    }

    /**
     * The Interface Color.
     */
    public static class Color {

        /** The Black. */
        public static final String BLACK = "black";

        /** The Blue. */
        public static final String BLUE = "blue";

        /** The Green. */
        public static final String GREEN = "green";

        /** The Red. */
        public static final String RED = "red";

        /** The White. */
        public static final String WHITE = "white";

        /** The Colorless. */
        public static final String COLORLESS = "colorless";
        // color order "wubrg"
        /** The Colors. */
        public static final String[] COLORS = { Color.WHITE, Color.BLUE, Color.BLACK, Color.RED, Color.GREEN,
                Color.COLORLESS };

        /** The only colors. */
        public static final String[] ONLY_COLORS = { Color.WHITE, Color.BLUE, Color.BLACK, Color.RED, Color.GREEN };

        /** The Snow. */
        public static final String SNOW = "snow";

        /** The Mana colors. */
        public static final String[] MANA_COLORS = { Color.WHITE, Color.BLUE, Color.BLACK, Color.RED, Color.GREEN,
                Color.COLORLESS, Color.SNOW };

        /** The loaded. */
        public static final boolean[] LOADED = { false };

        /** The Basic lands. */
        public static final String[] BASIC_LANDS = { "Plains", "Island", "Swamp", "Mountain", "Forest" };
    }

    /**
     * The Interface CardTypes.
     */
    public static class CardTypes {

        /** The loaded. */
        public static final boolean[] LOADED = { false };

        /** The card types. */
        public static final ConstantStringArrayList[] CARD_TYPES = new ConstantStringArrayList[1];

        /** The super types. */
        public static final ConstantStringArrayList[] SUPER_TYPES = new ConstantStringArrayList[1];

        /** The basic types. */
        public static final ConstantStringArrayList[] BASIC_TYPES = new ConstantStringArrayList[1];

        /** The land types. */
        public static final ConstantStringArrayList[] LAND_TYPES = new ConstantStringArrayList[1];

        /** The creature types. */
        public static final ConstantStringArrayList[] CREATURE_TYPES = new ConstantStringArrayList[1];

        /** The instant types. */
        public static final ConstantStringArrayList[] INSTANT_TYPES = new ConstantStringArrayList[1];

        /** The sorcery types. */
        public static final ConstantStringArrayList[] SORCERY_TYPES = new ConstantStringArrayList[1];

        /** The enchantment types. */
        public static final ConstantStringArrayList[] ENCHANTMENT_TYPES = new ConstantStringArrayList[1];

        /** The artifact types. */
        public static final ConstantStringArrayList[] ARTIFACT_TYPES = new ConstantStringArrayList[1];

        /** The walker types. */
        public static final ConstantStringArrayList[] WALKER_TYPES = new ConstantStringArrayList[1];
    }

    /**
     * The Interface Keywords.
     */
    public static class Keywords {

        /** The loaded. */
        public static final boolean[] LOADED = { false };

        /** The Non stacking list. */
        public static final ConstantStringArrayList[] NON_STACKING_LIST = new ConstantStringArrayList[1];
    }

} // Constant
