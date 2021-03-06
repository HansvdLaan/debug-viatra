/**
 * Generated from platform:/resource/rbacviatratest/src/queries/TestQueries.vql
 */
package queries;

import com.hans.rbac.model.rbac.Permission;
import com.hans.rbac.model.rbac.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // ------------------------------------------
 *         
 *         
 *         // ----- Access Relation -----
 *         
 *         pattern accessRelation(user: User, permission: Permission) {
 *             User.UR(user,role);
 *             Role.RD(role, demarcation);
 *            	Demarcation.DP(demarcation, permission);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AccessRelation extends BaseGeneratedEMFQuerySpecification<AccessRelation.Matcher> {
  /**
   * Pattern-specific match representation of the queries.accessRelation pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private User fUser;
    
    private Permission fPermission;
    
    private static List<String> parameterNames = makeImmutableList("user", "permission");
    
    private Match(final User pUser, final Permission pPermission) {
      this.fUser = pUser;
      this.fPermission = pPermission;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "user": return this.fUser;
          case "permission": return this.fPermission;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fUser;
          case 1: return this.fPermission;
          default: return null;
      }
    }
    
    public User getUser() {
      return this.fUser;
    }
    
    public Permission getPermission() {
      return this.fPermission;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("user".equals(parameterName) ) {
          this.fUser = (User) newValue;
          return true;
      }
      if ("permission".equals(parameterName) ) {
          this.fPermission = (Permission) newValue;
          return true;
      }
      return false;
    }
    
    public void setUser(final User pUser) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUser = pUser;
    }
    
    public void setPermission(final Permission pPermission) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPermission = pPermission;
    }
    
    @Override
    public String patternName() {
      return "queries.accessRelation";
    }
    
    @Override
    public List<String> parameterNames() {
      return AccessRelation.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fUser, fPermission};
    }
    
    @Override
    public AccessRelation.Match toImmutable() {
      return isMutable() ? newMatch(fUser, fPermission) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
      result.append("\"permission\"=" + prettyPrintValue(fPermission));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fUser, fPermission);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AccessRelation.Match)) {
          AccessRelation.Match other = (AccessRelation.Match) obj;
          return Objects.equals(fUser, other.fUser) && Objects.equals(fPermission, other.fPermission);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public AccessRelation specification() {
      return AccessRelation.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AccessRelation.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AccessRelation.Match newMutableMatch(final User pUser, final Permission pPermission) {
      return new Mutable(pUser, pPermission);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AccessRelation.Match newMatch(final User pUser, final Permission pPermission) {
      return new Immutable(pUser, pPermission);
    }
    
    private static final class Mutable extends AccessRelation.Match {
      Mutable(final User pUser, final Permission pPermission) {
        super(pUser, pPermission);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AccessRelation.Match {
      Immutable(final User pUser, final Permission pPermission) {
        super(pUser, pPermission);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.accessRelation pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ------------------------------------------
   * 
   * 
   * // ----- Access Relation -----
   * 
   * pattern accessRelation(user: User, permission: Permission) {
   *     User.UR(user,role);
   *     Role.RD(role, demarcation);
   *    	Demarcation.DP(demarcation, permission);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AccessRelation
   * 
   */
  public static class Matcher extends BaseMatcher<AccessRelation.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AccessRelation.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static AccessRelation.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_USER = 0;
    
    private static final int POSITION_PERMISSION = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AccessRelation.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AccessRelation.Match> getAllMatches(final User pUser, final Permission pPermission) {
      return rawStreamAllMatches(new Object[]{pUser, pPermission}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AccessRelation.Match> streamAllMatches(final User pUser, final Permission pPermission) {
      return rawStreamAllMatches(new Object[]{pUser, pPermission});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AccessRelation.Match> getOneArbitraryMatch(final User pUser, final Permission pPermission) {
      return rawGetOneArbitraryMatch(new Object[]{pUser, pPermission});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final User pUser, final Permission pPermission) {
      return rawHasMatch(new Object[]{pUser, pPermission});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final User pUser, final Permission pPermission) {
      return rawCountMatches(new Object[]{pUser, pPermission});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final User pUser, final Permission pPermission, final Consumer<? super AccessRelation.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pUser, pPermission}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUser the fixed value of pattern parameter user, or null if not bound.
     * @param pPermission the fixed value of pattern parameter permission, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AccessRelation.Match newMatch(final User pUser, final Permission pPermission) {
      return AccessRelation.Match.newMatch(pUser, pPermission);
    }
    
    /**
     * Retrieve the set of values that occur in matches for user.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<User> rawStreamAllValuesOfuser(final Object[] parameters) {
      return rawStreamAllValues(POSITION_USER, parameters).map(User.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for user.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuser() {
      return rawStreamAllValuesOfuser(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for user.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuser() {
      return rawStreamAllValuesOfuser(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for user.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuser(final AccessRelation.Match partialMatch) {
      return rawStreamAllValuesOfuser(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for user.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuser(final Permission pPermission) {
      return rawStreamAllValuesOfuser(new Object[]{null, pPermission});
    }
    
    /**
     * Retrieve the set of values that occur in matches for user.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuser(final AccessRelation.Match partialMatch) {
      return rawStreamAllValuesOfuser(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for user.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuser(final Permission pPermission) {
      return rawStreamAllValuesOfuser(new Object[]{null, pPermission}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for permission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Permission> rawStreamAllValuesOfpermission(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PERMISSION, parameters).map(Permission.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for permission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Permission> getAllValuesOfpermission() {
      return rawStreamAllValuesOfpermission(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for permission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Permission> streamAllValuesOfpermission() {
      return rawStreamAllValuesOfpermission(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for permission.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Permission> streamAllValuesOfpermission(final AccessRelation.Match partialMatch) {
      return rawStreamAllValuesOfpermission(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for permission.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Permission> streamAllValuesOfpermission(final User pUser) {
      return rawStreamAllValuesOfpermission(new Object[]{pUser, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for permission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Permission> getAllValuesOfpermission(final AccessRelation.Match partialMatch) {
      return rawStreamAllValuesOfpermission(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for permission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Permission> getAllValuesOfpermission(final User pUser) {
      return rawStreamAllValuesOfpermission(new Object[]{pUser, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected AccessRelation.Match tupleToMatch(final Tuple t) {
      try {
          return AccessRelation.Match.newMatch((User) t.get(POSITION_USER), (Permission) t.get(POSITION_PERMISSION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AccessRelation.Match arrayToMatch(final Object[] match) {
      try {
          return AccessRelation.Match.newMatch((User) match[POSITION_USER], (Permission) match[POSITION_PERMISSION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AccessRelation.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AccessRelation.Match.newMutableMatch((User) match[POSITION_USER], (Permission) match[POSITION_PERMISSION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<AccessRelation.Matcher> querySpecification() {
      return AccessRelation.instance();
    }
  }
  
  private AccessRelation() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AccessRelation instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AccessRelation.Matcher instantiate(final ViatraQueryEngine engine) {
    return AccessRelation.Matcher.on(engine);
  }
  
  @Override
  public AccessRelation.Matcher instantiate() {
    return AccessRelation.Matcher.create();
  }
  
  @Override
  public AccessRelation.Match newEmptyMatch() {
    return AccessRelation.Match.newEmptyMatch();
  }
  
  @Override
  public AccessRelation.Match newMatch(final Object... parameters) {
    return AccessRelation.Match.newMatch((com.hans.rbac.model.rbac.User) parameters[0], (com.hans.rbac.model.rbac.Permission) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AccessRelation} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AccessRelation#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AccessRelation INSTANCE = new AccessRelation();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final AccessRelation.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_user = new PParameter("user", "com.hans.rbac.model.rbac.User", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "User")), PParameterDirection.INOUT);
    
    private final PParameter parameter_permission = new PParameter("permission", "com.hans.rbac.model.rbac.Permission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Permission")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_user, parameter_permission);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.accessRelation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","permission");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_user = body.getOrCreateVariableByName("user");
          PVariable var_permission = body.getOrCreateVariableByName("permission");
          PVariable var_role = body.getOrCreateVariableByName("role");
          PVariable var_demarcation = body.getOrCreateVariableByName("demarcation");
          new TypeConstraint(body, Tuples.flatTupleOf(var_user), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "User")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_permission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Permission")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_user, parameter_user),
             new ExportedParameter(body, var_permission, parameter_permission)
          ));
          //     User.UR(user,role)
          new TypeConstraint(body, Tuples.flatTupleOf(var_user), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "User")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_user, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "User", "UR")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          new Equality(body, var__virtual_0_, var_role);
          //     Role.RD(role, demarcation)
          new TypeConstraint(body, Tuples.flatTupleOf(var_role), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_role, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Role", "RD")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Demarcation")));
          new Equality(body, var__virtual_1_, var_demarcation);
          //    	Demarcation.DP(demarcation, permission)
          new TypeConstraint(body, Tuples.flatTupleOf(var_demarcation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Demarcation")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_demarcation, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Demarcation", "DP")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Permission")));
          new Equality(body, var__virtual_2_, var_permission);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
