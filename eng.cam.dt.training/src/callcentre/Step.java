/**
 */
package callcentre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link callcentre.Step#getText <em>Text</em>}</li>
 *   <li>{@link callcentre.Step#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link callcentre.Step#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see callcentre.CallcentrePackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see callcentre.CallcentrePackage#getStep_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link callcentre.Step#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link callcentre.Transition}.
	 * It is bidirectional and its opposite is '{@link callcentre.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see callcentre.CallcentrePackage#getStep_Outgoing()
	 * @see callcentre.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link callcentre.Transition}.
	 * It is bidirectional and its opposite is '{@link callcentre.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see callcentre.CallcentrePackage#getStep_Incoming()
	 * @see callcentre.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // Step
