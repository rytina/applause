/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ProviderConstruction;
import org.applause.lang.applauseDsl.ScalarExpression;
import org.applause.lang.applauseDsl.SectionCell;
import org.applause.lang.applauseDsl.ViewForAllSections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View For All Sections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewForAllSectionsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewForAllSectionsImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewForAllSectionsImpl#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewForAllSectionsImpl extends MinimalEObjectImpl.Container implements ViewForAllSections
{
  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected ScalarExpression title;

  /**
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected ProviderConstruction provider;

  /**
   * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCells()
   * @generated
   * @ordered
   */
  protected EList<SectionCell> cells;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewForAllSectionsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplauseDslPackage.Literals.VIEW_FOR_ALL_SECTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(ScalarExpression newTitle, NotificationChain msgs)
  {
    ScalarExpression oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(ScalarExpression newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProviderConstruction getProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProvider(ProviderConstruction newProvider, NotificationChain msgs)
  {
    ProviderConstruction oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER, oldProvider, newProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(ProviderConstruction newProvider)
  {
    if (newProvider != provider)
    {
      NotificationChain msgs = null;
      if (provider != null)
        msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER, null, msgs);
      if (newProvider != null)
        msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER, null, msgs);
      msgs = basicSetProvider(newProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER, newProvider, newProvider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SectionCell> getCells()
  {
    if (cells == null)
    {
      cells = new EObjectContainmentEList<SectionCell>(SectionCell.class, this, ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__CELLS);
    }
    return cells;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE:
        return basicSetTitle(null, msgs);
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER:
        return basicSetProvider(null, msgs);
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__CELLS:
        return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE:
        return getTitle();
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER:
        return getProvider();
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__CELLS:
        return getCells();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE:
        setTitle((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER:
        setProvider((ProviderConstruction)newValue);
        return;
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__CELLS:
        getCells().clear();
        getCells().addAll((Collection<? extends SectionCell>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE:
        setTitle((ScalarExpression)null);
        return;
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER:
        setProvider((ProviderConstruction)null);
        return;
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__CELLS:
        getCells().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__TITLE:
        return title != null;
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__PROVIDER:
        return provider != null;
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS__CELLS:
        return cells != null && !cells.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ViewForAllSectionsImpl
