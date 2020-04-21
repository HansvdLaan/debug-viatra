/**
 * Generated from platform:/resource/rbacviatratest/src/queries/TestQueries.vql
 */
package queries;

import com.hans.rbac.model.rbac.Demarcation;
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
 *         pattern demarcationShouldHaveAPermission(dem: Demarcation) {
 *             neg Demarcation.DP(dem, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DemarcationShouldHaveAPermission extends BaseGeneratedEMFQuerySpecification<DemarcationShouldHaveAPermission.Matcher> {
  /**
   * Pattern-specific match representation of the queries.demarcationShouldHaveAPermission pattern,
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
    private Demarcation fDem;
    
    private static List<String> parameterNames = makeImmutableList("dem");
    
    private Match(final Demarcation pDem) {
      this.fDem = pDem;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "dem": return this.fDem;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fDem;
          default: return null;
      }
    }
    
    public Demarcation getDem() {
      return this.fDem;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("dem".equals(parameterName) ) {
          this.fDem = (Demarcation) newValue;
          return true;
      }
      return false;
    }
    
    public void setDem(final Demarcation pDem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDem = pDem;
    }
    
    @Override
    public String patternName() {
      return "queries.demarcationShouldHaveAPermission";
    }
    
    @Override
    public List<String> parameterNames() {
      return DemarcationShouldHaveAPermission.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDem};
    }
    
    @Override
    public DemarcationShouldHaveAPermission.Match toImmutable() {
      return isMutable() ? newMatch(fDem) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"dem\"=" + prettyPrintValue(fDem));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDem);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DemarcationShouldHaveAPermission.Match)) {
          DemarcationShouldHaveAPermission.Match other = (DemarcationShouldHaveAPermission.Match) obj;
          return Objects.equals(fDem, other.fDem);
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
    public DemarcationShouldHaveAPermission specification() {
      return DemarcationShouldHaveAPermission.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DemarcationShouldHaveAPermission.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DemarcationShouldHaveAPermission.Match newMutableMatch(final Demarcation pDem) {
      return new Mutable(pDem);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DemarcationShouldHaveAPermission.Match newMatch(final Demarcation pDem) {
      return new Immutable(pDem);
    }
    
    private static final class Mutable extends DemarcationShouldHaveAPermission.Match {
      Mutable(final Demarcation pDem) {
        super(pDem);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DemarcationShouldHaveAPermission.Match {
      Immutable(final Demarcation pDem) {
        super(pDem);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.demarcationShouldHaveAPermission pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern demarcationShouldHaveAPermission(dem: Demarcation) {
   *     neg Demarcation.DP(dem, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DemarcationShouldHaveAPermission
   * 
   */
  public static class Matcher extends BaseMatcher<DemarcationShouldHaveAPermission.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DemarcationShouldHaveAPermission.Matcher on(final ViatraQueryEngine engine) {
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
    public static DemarcationShouldHaveAPermission.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DEM = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DemarcationShouldHaveAPermission.Matcher.class);
    
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
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DemarcationShouldHaveAPermission.Match> getAllMatches(final Demarcation pDem) {
      return rawStreamAllMatches(new Object[]{pDem}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DemarcationShouldHaveAPermission.Match> streamAllMatches(final Demarcation pDem) {
      return rawStreamAllMatches(new Object[]{pDem});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DemarcationShouldHaveAPermission.Match> getOneArbitraryMatch(final Demarcation pDem) {
      return rawGetOneArbitraryMatch(new Object[]{pDem});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Demarcation pDem) {
      return rawHasMatch(new Object[]{pDem});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Demarcation pDem) {
      return rawCountMatches(new Object[]{pDem});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Demarcation pDem, final Consumer<? super DemarcationShouldHaveAPermission.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDem}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDem the fixed value of pattern parameter dem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DemarcationShouldHaveAPermission.Match newMatch(final Demarcation pDem) {
      return DemarcationShouldHaveAPermission.Match.newMatch(pDem);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Demarcation> rawStreamAllValuesOfdem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DEM, parameters).map(Demarcation.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Demarcation> getAllValuesOfdem() {
      return rawStreamAllValuesOfdem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Demarcation> streamAllValuesOfdem() {
      return rawStreamAllValuesOfdem(emptyArray());
    }
    
    @Override
    protected DemarcationShouldHaveAPermission.Match tupleToMatch(final Tuple t) {
      try {
          return DemarcationShouldHaveAPermission.Match.newMatch((Demarcation) t.get(POSITION_DEM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DemarcationShouldHaveAPermission.Match arrayToMatch(final Object[] match) {
      try {
          return DemarcationShouldHaveAPermission.Match.newMatch((Demarcation) match[POSITION_DEM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DemarcationShouldHaveAPermission.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DemarcationShouldHaveAPermission.Match.newMutableMatch((Demarcation) match[POSITION_DEM]);
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
    public static IQuerySpecification<DemarcationShouldHaveAPermission.Matcher> querySpecification() {
      return DemarcationShouldHaveAPermission.instance();
    }
  }
  
  private DemarcationShouldHaveAPermission() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DemarcationShouldHaveAPermission instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DemarcationShouldHaveAPermission.Matcher instantiate(final ViatraQueryEngine engine) {
    return DemarcationShouldHaveAPermission.Matcher.on(engine);
  }
  
  @Override
  public DemarcationShouldHaveAPermission.Matcher instantiate() {
    return DemarcationShouldHaveAPermission.Matcher.create();
  }
  
  @Override
  public DemarcationShouldHaveAPermission.Match newEmptyMatch() {
    return DemarcationShouldHaveAPermission.Match.newEmptyMatch();
  }
  
  @Override
  public DemarcationShouldHaveAPermission.Match newMatch(final Object... parameters) {
    return DemarcationShouldHaveAPermission.Match.newMatch((com.hans.rbac.model.rbac.Demarcation) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DemarcationShouldHaveAPermission} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link DemarcationShouldHaveAPermission#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DemarcationShouldHaveAPermission INSTANCE = new DemarcationShouldHaveAPermission();
    
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
    private static final DemarcationShouldHaveAPermission.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_dem = new PParameter("dem", "com.hans.rbac.model.rbac.Demarcation", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Demarcation")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_dem);
    
    private class Embedded_1_Demarcation_DP extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.hans.rbac.model.rbac.Demarcation", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Demarcation")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.hans.rbac.model.rbac.Permission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Permission")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Demarcation_DP() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Demarcation_DP";
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
        //  Demarcation.DP(dem, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Demarcation")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Demarcation", "DP")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Permission")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.demarcationShouldHaveAPermission";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("dem");
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
          PVariable var_dem = body.getOrCreateVariableByName("dem");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Demarcation")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_dem, parameter_dem)
          ));
          //     neg Demarcation.DP(dem, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_dem, var___0_), new DemarcationShouldHaveAPermission.GeneratedPQuery.Embedded_1_Demarcation_DP());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
