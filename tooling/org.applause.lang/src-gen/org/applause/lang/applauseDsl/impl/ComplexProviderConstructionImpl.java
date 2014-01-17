/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ComplexProviderConstruction;
import org.applause.lang.applauseDsl.ContentProvider;
import org.applause.lang.applauseDsl.Expression;
import org.applause.lang.applauseDsl.PredefinedParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Provider Construction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ComplexProviderConstructionImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ComplexProviderConstructionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ComplexProviderConstructionImpl#getPredefinedParameter <em>Predefined Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexProviderConstructionImpl extends ProviderConstructionImpl implements ComplexProviderConstruction
{
  /**
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected ContentProvider provider;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected Expression argument;

  /**
   * The cached value of the '{@link #getPredefinedParameter() <em>Predefined Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefinedParameter()
   * @generated
   * @ordered
   */
  protected PredefinedParameter predefinedParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexProviderConstructionImpl()
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
    return ApplauseDslPackage.Literals.COMPLEX_PROVIDER_CONSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider getProvider()
  {
    if (provider != null && provider.eIsProxy())
    {
      InternalEObject oldProvider = (InternalEObject)provider;
      provider = (ContentProvider)eResolveProxy(oldProvider);
      if (provider != oldProvider)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER, oldProvider, provider));
      }
    }
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider basicGetProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(ContentProvider newProvider)
  {
    ContentProvider oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER, oldProvider, provider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(Expression newArgument, NotificationChain msgs)
  {
    Expression oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(Expression newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT, newArgument, newArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredefinedParameter getPredefinedParameter()
  {
    return predefinedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredefinedParameter(PredefinedParameter newPredefinedParameter, NotificationChain msgs)
  {
    PredefinedParameter oldPredefinedParameter = predefinedParameter;
    predefinedParameter = newPredefinedParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER, oldPredefinedParameter, newPredefinedParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredefinedParameter(PredefinedParameter newPredefinedParameter)
  {
    if (newPredefinedParameter != predefinedParameter)
    {
      NotificationChain msgs = null;
      if (predefinedParameter != null)
        msgs = ((InternalEObject)predefinedParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER, null, msgs);
      if (newPredefinedParameter != null)
        msgs = ((InternalEObject)newPredefinedParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER, null, msgs);
      msgs = basicSetPredefinedParameter(newPredefinedParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER, newPredefinedParameter, newPredefinedParameter));
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
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT:
        return basicSetArgument(null, msgs);
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER:
        return basicSetPredefinedParameter(null, msgs);
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
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER:
        if (resolve) return getProvider();
        return basicGetProvider();
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT:
        return getArgument();
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER:
        return getPredefinedParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER:
        setProvider((ContentProvider)newValue);
        return;
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT:
        setArgument((Expression)newValue);
        return;
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER:
        setPredefinedParameter((PredefinedParameter)newValue);
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
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER:
        setProvider((ContentProvider)null);
        return;
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT:
        setArgument((Expression)null);
        return;
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER:
        setPredefinedParameter((PredefinedParameter)null);
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
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER:
        return provider != null;
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT:
        return argument != null;
      case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER:
        return predefinedParameter != null;
    }
    return super.eIsSet(featureID);
  }

} //ComplexProviderConstructionImpl
