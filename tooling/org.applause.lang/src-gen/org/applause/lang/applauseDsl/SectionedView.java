/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sectioned View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.SectionedView#getSuperView <em>Super View</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.SectionedView#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.SectionedView#getForAllSections <em>For All Sections</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.SectionedView#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getSectionedView()
 * @model
 * @generated
 */
public interface SectionedView extends View
{
  /**
   * Returns the value of the '<em><b>Super View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super View</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super View</em>' reference.
   * @see #setSuperView(SectionedView)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getSectionedView_SuperView()
   * @model
   * @generated
   */
  SectionedView getSuperView();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.SectionedView#getSuperView <em>Super View</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super View</em>' reference.
   * @see #getSuperView()
   * @generated
   */
  void setSuperView(SectionedView value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getSectionedView_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.SectionedView#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>For All Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For All Sections</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For All Sections</em>' containment reference.
   * @see #setForAllSections(ViewForAllSections)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getSectionedView_ForAllSections()
   * @model containment="true"
   * @generated
   */
  ViewForAllSections getForAllSections();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.SectionedView#getForAllSections <em>For All Sections</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For All Sections</em>' containment reference.
   * @see #getForAllSections()
   * @generated
   */
  void setForAllSections(ViewForAllSections value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.ViewSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getSectionedView_Sections()
   * @model containment="true"
   * @generated
   */
  EList<ViewSection> getSections();

} // SectionedView
