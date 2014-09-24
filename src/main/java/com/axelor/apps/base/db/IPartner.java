/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2014 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.base.db;

/**
 * Interface of Partner object. Enum all static variable of object.
 * 
 */
public interface IPartner {

	/**
	 * Static partner type select
	 */

	static final int PARTNER_TYPE_SELECT_ENTERPRISE = 1;
	static final int PARTNER_TYPE_SELECT_INDIVIDUAL = 2;


	static final int CUSTOMER_TYPE_SELECT_NO = 1;
	static final int CUSTOMER_TYPE_SELECT_PROSPECT = 2;
	static final int CUSTOMER_TYPE_SELECT_YES = 3;
	
	static final int SUPPLIER_TYPE_SELECT_NO = 1;
	static final int SUPPLIER_TYPE_SELECT_YES = 2;
	static final int SUPPLIER_TYPE_SELECT_APPROVED = 3;
}
