package org.jbox2d.dynamics;

import org.jbox2d.common.Vec2;
import org.jbox2d.structs.collision.shapes.MassData;

/**
 * A body definition holds all the data needed to construct a rigid body.
 * You can safely re-use body definitions.
 * Shapes are added to a body after construction.
 *
 * @author daniel
 */
public class BodyDef {
	
	/**
	 * Use this to store application specific body data.
	 */
	public Object userData;

	/**
	 * The world position of the body. Avoid creating bodies at the origin
	 * since this can lead to many overlapping shapes.
	 */
	public Vec2 position;

	/**
	 * The world angle of the body in radians.
	 */
	public float angle;

	/**
	 * The linear velocity of the body in world co-ordinates.
	 */
	public Vec2 linearVelocity;

	/**
	 * The angular velocity of the body.
	 */
	public float angularVelocity;

	/**
	 * Linear damping is use to reduce the linear velocity. The damping parameter
	 * can be larger than 1.0f but the damping effect becomes sensitive to the
	 * time step when the damping parameter is large.
	 */
	public float linearDamping;

	/**
	 * Angular damping is use to reduce the angular velocity. The damping parameter
	 * can be larger than 1.0f but the damping effect becomes sensitive to the
	 * time step when the damping parameter is large.
	 */
	public float angularDamping;

	/**
	 * Set this flag to false if this body should never fall asleep. Note that
	 * this increases CPU usage.
	 */
	public boolean allowSleep;

	/**
	 * Is this body initially sleeping?
	 */
	public boolean isSleeping;

	/**
	 * Should this body be prevented from rotating? Useful for characters.
	 */
	public boolean fixedRotation;

	/**
	 * Is this a fast moving body that should be prevented from tunneling through
	 * other moving bodies? Note that all bodies are prevented from tunneling through
	 * static bodies.
	 * @warning You should use this flag sparingly since it increases processing time.
	 */
	public boolean isBullet;
	
	public BodyDef(){
		userData = null;
		position = new Vec2();
		angle = 0f;
		linearVelocity = new Vec2();
		angularVelocity = 0f;
		linearDamping = 0f;
		angularDamping = 0f;
		allowSleep = true;
		isSleeping = false;
		fixedRotation = false;
		isBullet = false;
	}
}