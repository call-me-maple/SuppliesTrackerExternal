/*
 * Copyright (c) 2018, Daddy Dozer <https://github.com/Dyldozer>
 * Copyright (c) 2018, Davis Cook <daviscook447@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *	list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *	this list of conditions and the following disclaimer in the documentation
 *	and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.suppliestracker;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import static net.runelite.api.ItemID.ADAMANT_DART;
import static net.runelite.api.ItemID.BRONZE_DART;
import static net.runelite.api.ItemID.DRAGON_DART;
import static net.runelite.api.ItemID.IRON_DART;
import static net.runelite.api.ItemID.MITHRIL_DART;
import static net.runelite.api.ItemID.RUNE_DART;
import static net.runelite.api.ItemID.STEEL_DART;
import static net.runelite.api.ItemID.BLACK_DART;
import static net.runelite.api.ItemID.AMETHYST_DART;

/**
 * Type of darts that can be put into the blowpipe
 */
@AllArgsConstructor
public enum BlowpipeDartType
{
	BRONZE(BRONZE_DART), IRON(IRON_DART),
	STEEL(STEEL_DART), BLACK(BLACK_DART),
	MITHRIL(MITHRIL_DART), ADAMANT(ADAMANT_DART),
	RUNE(RUNE_DART), AMETHYST(AMETHYST_DART),
	DRAGON(DRAGON_DART);

	@Getter(AccessLevel.MODULE)
	private int dartID;


	public static BlowpipeDartType getByItemName(String itemName)
	{
		switch (itemName)
		{
			case "Bronze dart" :
				return BRONZE;
			case "Iron dart" :
				return IRON;
			case "Steel dart" :
				return STEEL;
			case "Black dart" :
				return BLACK;
			case "Mithril dart" :
				return MITHRIL;
			case "Adamant dart" :
				return ADAMANT;
			case "Rune dart" :
				return RUNE;
			case "Amethyst dart" :
				return AMETHYST;
			case "Dragon dart" :
				return DRAGON;
			default:
				return null;
		}
	}
}
