/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.dataimporttool.web.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openmrs.api.context.Context;
import org.openmrs.module.dataimporttool.api.DataImportToolService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/module/dataimporttool/continueMigration.list")
public class ContinueMigrationController {

	/** Logger for this class and subclasses */
	protected final Log log = LogFactory.getLog(this.getClass());
		
	/** Success form view name */
	private final String SUCCESS_FORM_VIEW = "/module/dataimporttool/continueMigration";
		
	/**
     * Shows Migration Progress
     * @param HttpServletResponse
     */
	@RequestMapping(method = RequestMethod.GET)
	public String showMigration(ModelMap model, SessionStatus status) {
		
		return SUCCESS_FORM_VIEW;
	}
}
