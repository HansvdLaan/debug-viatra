/**
 * Generated from platform:/resource/rbacviatratest/src/queries/TestQueries.vql
 */
package queries;

import com.hans.rbac.model.rbac.Role;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         pattern roleShouldHaveADemarcation(role: Role) {
 *             neg Role.RD(role, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RoleShouldHaveADemarcation extends BaseGeneratedEMFQuerySpecification<RoleShouldHaveADemarcation.Matcher> {
  /**
   * Pattern-specific match representation of the queries.roleShouldHaveADemarcation pattern,
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
    private Role fRole;
    
    private static List<String> parameterNames = makeImmutableList("role");
    
    private Match(final Role pRole) {
      this.fRole = pRole;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "role": return this.fRole;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fRole;
          default: return null;
      }
    }
    
    public Role getRole() {
      return this.fRole;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("role".equals(parameterName) ) {
          this.fRole = (Role) newValue;
          return true;
      }
      return false;
    }
    
    public void setRole(final Role pRole) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRole = pRole;
    }
    
    @Override
    public String patternName() {
      return "queries.roleShouldHaveADemarcation";
    }
    
    @Override
    public List<String> parameterNames() {
      return RoleShouldHaveADemarcation.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fRole};
    }
    
    @Override
    public RoleShouldHaveADemarcation.Match toImmutable() {
      return isMutable() ? newMatch(fRole) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"role\"=" + prettyPrintValue(fRole));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fRole);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RoleShouldHaveADemarcation.Match)) {
          RoleShouldHaveADemarcation.Match other = (RoleShouldHaveADemarcation.Match) obj;
          return Objects.equals(fRole, other.fRole);
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
    public RoleShouldHaveADemarcation specification() {
      return RoleShouldHaveADemarcation.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RoleShouldHaveADemarcation.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RoleShouldHaveADemarcation.Match newMutableMatch(final Role pRole) {
      return new Mutable(pRole);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RoleShouldHaveADemarcation.Match newMatch(final Role pRole) {
      return new Immutable(pRole);
    }
    
    private static final class Mutable extends RoleShouldHaveADemarcation.Match {
      Mutable(final Role pRole) {
        super(pRole);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RoleShouldHaveADemarcation.Match {
      Immutable(final Role pRole) {
        super(pRole);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.roleShouldHaveADemarcation pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern roleShouldHaveADemarcation(role: Role) {
   *     neg Role.RD(role, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RoleShouldHaveADemarcation
   * 
   */
  public static class Matcher extends BaseMatcher<RoleShouldHaveADemarcation.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RoleShouldHaveADemarcation.Matcher on(final ViatraQueryEngine engine) {
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
    public static RoleShouldHaveADemarcation.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ROLE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RoleShouldHaveADemarcation.Matcher.class);
    
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
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RoleShouldHaveADemarcation.Match> getAllMatches(final Role pRole) {
      return rawStreamAllMatches(new Object[]{pRole}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RoleShouldHaveADemarcation.Match> streamAllMatches(final Role pRole) {
      return rawStreamAllMatches(new Object[]{pRole});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RoleShouldHaveADemarcation.Match> getOneArbitraryMatch(final Role pRole) {
      return rawGetOneArbitraryMatch(new Object[]{pRole});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Role pRole) {
      return rawHasMatch(new Object[]{pRole});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Role pRole) {
      return rawCountMatches(new Object[]{pRole});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Role pRole, final Consumer<? super RoleShouldHaveADemarcation.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRole}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRole the fixed value of pattern parameter role, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RoleShouldHaveADemarcation.Match newMatch(final Role pRole) {
      return RoleShouldHaveADemarcation.Match.newMatch(pRole);
    }
    
    /**
     * Retrieve the set of values that occur in matches for role.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Role> rawStreamAllValuesOfrole(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ROLE, parameters).map(Role.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for role.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Role> getAllValuesOfrole() {
      return rawStreamAllValuesOfrole(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for role.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Role> streamAllValuesOfrole() {
      return rawStreamAllValuesOfrole(emptyArray());
    }
    
    @Override
    protected RoleShouldHaveADemarcation.Match tupleToMatch(final Tuple t) {
      try {
          return RoleShouldHaveADemarcation.Match.newMatch((Role) t.get(POSITION_ROLE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RoleShouldHaveADemarcation.Match arrayToMatch(final Object[] match) {
      try {
          return RoleShouldHaveADemarcation.Match.newMatch((Role) match[POSITION_ROLE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RoleShouldHaveADemarcation.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RoleShouldHaveADemarcation.Match.newMutableMatch((Role) match[POSITION_ROLE]);
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
    public static IQuerySpecification<RoleShouldHaveADemarcation.Matcher> querySpecification() {
      return RoleShouldHaveADemarcation.instance();
    }
  }
  
  private RoleShouldHaveADemarcation() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RoleShouldHaveADemarcation instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RoleShouldHaveADemarcation.Matcher instantiate(final ViatraQueryEngine engine) {
    return RoleShouldHaveADemarcation.Matcher.on(engine);
  }
  
  @Override
  public RoleShouldHaveADemarcation.Matcher instantiate() {
    return RoleShouldHaveADemarcation.Matcher.create();
  }
  
  @Override
  public RoleShouldHaveADemarcation.Match newEmptyMatch() {
    return RoleShouldHaveADemarcation.Match.newEmptyMatch();
  }
  
  @Override
  public RoleShouldHaveADemarcation.Match newMatch(final Object... parameters) {
    return RoleShouldHaveADemarcation.Match.newMatch((com.hans.rbac.model.rbac.Role) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RoleShouldHaveADemarcation} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RoleShouldHaveADemarcation#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RoleShouldHaveADemarcation INSTANCE = new RoleShouldHaveADemarcation();
    
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
    private static final RoleShouldHaveADemarcation.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_role = new PParameter("role", "com.hans.rbac.model.rbac.Role", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Role")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_role);
    
    private class Embedded_1_Role_RD extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.hans.rbac.model.rbac.Role", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Role")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.hans.rbac.model.rbac.Demarcation", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Demarcation")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Role_RD() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Role_RD";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  Role.RD(role, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Role", "RD")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Demarcation")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.roleShouldHaveADemarcation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("role");
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
          PVariable var_role = body.getOrCreateVariableByName("role");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_role), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_role, parameter_role)
          ));
          //     neg Role.RD(role, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_role, var___0_), new RoleShouldHaveADemarcation.GeneratedPQuery.Embedded_1_Role_RD());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
