/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.Constant#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Constant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends VariableDeclaration
{
  /**
   * Returns the value of the '<em><b>Language</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getConstant_Language()
   * @model unique="false"
   * @generated
   */
  EList<String> getLanguage();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.ScalarExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getConstant_Value()
   * @model containment="true"
   * @generated
   */
  EList<ScalarExpression> getValue();

} // Constant
