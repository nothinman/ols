/*
 * OpenBench LogicSniffer / SUMP project 
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 *
 * Copyright (C) 2006-2010 Michael Poppitz, www.sump.org
 * Copyright (C) 2010 J.W. Janssen, www.lxtreme.nl
 */
package nl.lxtreme.ols.client.action;


import nl.lxtreme.ols.client.signal.*;


/**
 * 
 */
abstract class BaseZoomAction extends BaseAction
{
  // CONSTANTS

  private static final long       serialVersionUID = 1L;

  // VARIABLES

  private final DiagramScrollPane diagramScrollPane;

  // CONSTRUCTORS

  /**
   * @param aDiagram
   *          the diagram to zoom in/out/...
   */
  protected BaseZoomAction( final String aID, final DiagramScrollPane aDiagramScrollPane, final String aIconName,
      final String aName, final String aDescription )
  {
    super( aID, aIconName, aName, aDescription );
    this.diagramScrollPane = aDiagramScrollPane;
  }

  // METHODS

  /**
   * @return the diagram to zoom in/out/...
   */
  protected final DiagramScrollPane getDiagramScrollPane()
  {
    return this.diagramScrollPane;
  }

}

/* EOF */
