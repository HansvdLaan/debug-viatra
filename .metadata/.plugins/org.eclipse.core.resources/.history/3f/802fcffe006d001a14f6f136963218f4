/**
 * Generated from platform:/resource/rbacviatratest/src/queries/TestQueries.vql
 */
package queries;

import com.hans.rbac.model.rbac.Role;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         pattern SoDEmployeeAndVisitor(userE: User, userV: User, employee : Role, visitor : Role) {
 *             Role.name(employee, "Employee");
 *             Role.name(visitor, "Visitor");
 *            	Role.RU(employee, userE);
 *            	Role.RU(visitor, userV);
 *             userE==userV;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SoDEmployeeAndVisitor extends BaseGeneratedEMFQuerySpecification<SoDEmployeeAndVisitor.Matcher> {
  /**
   * Pattern-specific match representation of the queries.SoDEmployeeAndVisitor pattern,
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
    private User fUserE;
    
    private User fUserV;
    
    private Role fEmployee;
    
    private Role fVisitor;
    
    private static List<String> parameterNames = makeImmutableList("userE", "userV", "employee", "visitor");
    
    private Match(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      this.fUserE = pUserE;
      this.fUserV = pUserV;
      this.fEmployee = pEmployee;
      this.fVisitor = pVisitor;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "userE": return this.fUserE;
          case "userV": return this.fUserV;
          case "employee": return this.fEmployee;
          case "visitor": return this.fVisitor;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fUserE;
          case 1: return this.fUserV;
          case 2: return this.fEmployee;
          case 3: return this.fVisitor;
          default: return null;
      }
    }
    
    public User getUserE() {
      return this.fUserE;
    }
    
    public User getUserV() {
      return this.fUserV;
    }
    
    public Role getEmployee() {
      return this.fEmployee;
    }
    
    public Role getVisitor() {
      return this.fVisitor;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("userE".equals(parameterName) ) {
          this.fUserE = (User) newValue;
          return true;
      }
      if ("userV".equals(parameterName) ) {
          this.fUserV = (User) newValue;
          return true;
      }
      if ("employee".equals(parameterName) ) {
          this.fEmployee = (Role) newValue;
          return true;
      }
      if ("visitor".equals(parameterName) ) {
          this.fVisitor = (Role) newValue;
          return true;
      }
      return false;
    }
    
    public void setUserE(final User pUserE) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUserE = pUserE;
    }
    
    public void setUserV(final User pUserV) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUserV = pUserV;
    }
    
    public void setEmployee(final Role pEmployee) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEmployee = pEmployee;
    }
    
    public void setVisitor(final Role pVisitor) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVisitor = pVisitor;
    }
    
    @Override
    public String patternName() {
      return "queries.SoDEmployeeAndVisitor";
    }
    
    @Override
    public List<String> parameterNames() {
      return SoDEmployeeAndVisitor.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fUserE, fUserV, fEmployee, fVisitor};
    }
    
    @Override
    public SoDEmployeeAndVisitor.Match toImmutable() {
      return isMutable() ? newMatch(fUserE, fUserV, fEmployee, fVisitor) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"userE\"=" + prettyPrintValue(fUserE) + ", ");
      result.append("\"userV\"=" + prettyPrintValue(fUserV) + ", ");
      result.append("\"employee\"=" + prettyPrintValue(fEmployee) + ", ");
      result.append("\"visitor\"=" + prettyPrintValue(fVisitor));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fUserE, fUserV, fEmployee, fVisitor);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SoDEmployeeAndVisitor.Match)) {
          SoDEmployeeAndVisitor.Match other = (SoDEmployeeAndVisitor.Match) obj;
          return Objects.equals(fUserE, other.fUserE) && Objects.equals(fUserV, other.fUserV) && Objects.equals(fEmployee, other.fEmployee) && Objects.equals(fVisitor, other.fVisitor);
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
    public SoDEmployeeAndVisitor specification() {
      return SoDEmployeeAndVisitor.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SoDEmployeeAndVisitor.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SoDEmployeeAndVisitor.Match newMutableMatch(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return new Mutable(pUserE, pUserV, pEmployee, pVisitor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SoDEmployeeAndVisitor.Match newMatch(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return new Immutable(pUserE, pUserV, pEmployee, pVisitor);
    }
    
    private static final class Mutable extends SoDEmployeeAndVisitor.Match {
      Mutable(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
        super(pUserE, pUserV, pEmployee, pVisitor);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SoDEmployeeAndVisitor.Match {
      Immutable(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
        super(pUserE, pUserV, pEmployee, pVisitor);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.SoDEmployeeAndVisitor pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern SoDEmployeeAndVisitor(userE: User, userV: User, employee : Role, visitor : Role) {
   *     Role.name(employee, "Employee");
   *     Role.name(visitor, "Visitor");
   *    	Role.RU(employee, userE);
   *    	Role.RU(visitor, userV);
   *     userE==userV;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SoDEmployeeAndVisitor
   * 
   */
  public static class Matcher extends BaseMatcher<SoDEmployeeAndVisitor.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SoDEmployeeAndVisitor.Matcher on(final ViatraQueryEngine engine) {
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
    public static SoDEmployeeAndVisitor.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_USERE = 0;
    
    private static final int POSITION_USERV = 1;
    
    private static final int POSITION_EMPLOYEE = 2;
    
    private static final int POSITION_VISITOR = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SoDEmployeeAndVisitor.Matcher.class);
    
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
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SoDEmployeeAndVisitor.Match> getAllMatches(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return rawStreamAllMatches(new Object[]{pUserE, pUserV, pEmployee, pVisitor}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SoDEmployeeAndVisitor.Match> streamAllMatches(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return rawStreamAllMatches(new Object[]{pUserE, pUserV, pEmployee, pVisitor});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SoDEmployeeAndVisitor.Match> getOneArbitraryMatch(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return rawGetOneArbitraryMatch(new Object[]{pUserE, pUserV, pEmployee, pVisitor});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return rawHasMatch(new Object[]{pUserE, pUserV, pEmployee, pVisitor});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return rawCountMatches(new Object[]{pUserE, pUserV, pEmployee, pVisitor});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor, final Consumer<? super SoDEmployeeAndVisitor.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pUserE, pUserV, pEmployee, pVisitor}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUserE the fixed value of pattern parameter userE, or null if not bound.
     * @param pUserV the fixed value of pattern parameter userV, or null if not bound.
     * @param pEmployee the fixed value of pattern parameter employee, or null if not bound.
     * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SoDEmployeeAndVisitor.Match newMatch(final User pUserE, final User pUserV, final Role pEmployee, final Role pVisitor) {
      return SoDEmployeeAndVisitor.Match.newMatch(pUserE, pUserV, pEmployee, pVisitor);
    }
    
    /**
     * Retrieve the set of values that occur in matches for userE.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<User> rawStreamAllValuesOfuserE(final Object[] parameters) {
      return rawStreamAllValues(POSITION_USERE, parameters).map(User.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for userE.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuserE() {
      return rawStreamAllValuesOfuserE(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userE.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuserE() {
      return rawStreamAllValuesOfuserE(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userE.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuserE(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfuserE(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userE.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuserE(final User pUserV, final Role pEmployee, final Role pVisitor) {
      return rawStreamAllValuesOfuserE(new Object[]{null, pUserV, pEmployee, pVisitor});
    }
    
    /**
     * Retrieve the set of values that occur in matches for userE.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuserE(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfuserE(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userE.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuserE(final User pUserV, final Role pEmployee, final Role pVisitor) {
      return rawStreamAllValuesOfuserE(new Object[]{null, pUserV, pEmployee, pVisitor}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userV.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<User> rawStreamAllValuesOfuserV(final Object[] parameters) {
      return rawStreamAllValues(POSITION_USERV, parameters).map(User.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for userV.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuserV() {
      return rawStreamAllValuesOfuserV(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userV.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuserV() {
      return rawStreamAllValuesOfuserV(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userV.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuserV(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfuserV(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userV.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfuserV(final User pUserE, final Role pEmployee, final Role pVisitor) {
      return rawStreamAllValuesOfuserV(new Object[]{pUserE, null, pEmployee, pVisitor});
    }
    
    /**
     * Retrieve the set of values that occur in matches for userV.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuserV(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfuserV(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for userV.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfuserV(final User pUserE, final Role pEmployee, final Role pVisitor) {
      return rawStreamAllValuesOfuserV(new Object[]{pUserE, null, pEmployee, pVisitor}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for employee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Role> rawStreamAllValuesOfemployee(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EMPLOYEE, parameters).map(Role.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for employee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Role> getAllValuesOfemployee() {
      return rawStreamAllValuesOfemployee(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for employee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Role> streamAllValuesOfemployee() {
      return rawStreamAllValuesOfemployee(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for employee.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Role> streamAllValuesOfemployee(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfemployee(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for employee.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Role> streamAllValuesOfemployee(final User pUserE, final User pUserV, final Role pVisitor) {
      return rawStreamAllValuesOfemployee(new Object[]{pUserE, pUserV, null, pVisitor});
    }
    
    /**
     * Retrieve the set of values that occur in matches for employee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Role> getAllValuesOfemployee(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfemployee(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for employee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Role> getAllValuesOfemployee(final User pUserE, final User pUserV, final Role pVisitor) {
      return rawStreamAllValuesOfemployee(new Object[]{pUserE, pUserV, null, pVisitor}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for visitor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Role> rawStreamAllValuesOfvisitor(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VISITOR, parameters).map(Role.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for visitor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Role> getAllValuesOfvisitor() {
      return rawStreamAllValuesOfvisitor(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for visitor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Role> streamAllValuesOfvisitor() {
      return rawStreamAllValuesOfvisitor(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for visitor.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Role> streamAllValuesOfvisitor(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfvisitor(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for visitor.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Role> streamAllValuesOfvisitor(final User pUserE, final User pUserV, final Role pEmployee) {
      return rawStreamAllValuesOfvisitor(new Object[]{pUserE, pUserV, pEmployee, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for visitor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Role> getAllValuesOfvisitor(final SoDEmployeeAndVisitor.Match partialMatch) {
      return rawStreamAllValuesOfvisitor(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for visitor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Role> getAllValuesOfvisitor(final User pUserE, final User pUserV, final Role pEmployee) {
      return rawStreamAllValuesOfvisitor(new Object[]{pUserE, pUserV, pEmployee, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SoDEmployeeAndVisitor.Match tupleToMatch(final Tuple t) {
      try {
          return SoDEmployeeAndVisitor.Match.newMatch((User) t.get(POSITION_USERE), (User) t.get(POSITION_USERV), (Role) t.get(POSITION_EMPLOYEE), (Role) t.get(POSITION_VISITOR));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SoDEmployeeAndVisitor.Match arrayToMatch(final Object[] match) {
      try {
          return SoDEmployeeAndVisitor.Match.newMatch((User) match[POSITION_USERE], (User) match[POSITION_USERV], (Role) match[POSITION_EMPLOYEE], (Role) match[POSITION_VISITOR]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SoDEmployeeAndVisitor.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SoDEmployeeAndVisitor.Match.newMutableMatch((User) match[POSITION_USERE], (User) match[POSITION_USERV], (Role) match[POSITION_EMPLOYEE], (Role) match[POSITION_VISITOR]);
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
    public static IQuerySpecification<SoDEmployeeAndVisitor.Matcher> querySpecification() {
      return SoDEmployeeAndVisitor.instance();
    }
  }
  
  private SoDEmployeeAndVisitor() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SoDEmployeeAndVisitor instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SoDEmployeeAndVisitor.Matcher instantiate(final ViatraQueryEngine engine) {
    return SoDEmployeeAndVisitor.Matcher.on(engine);
  }
  
  @Override
  public SoDEmployeeAndVisitor.Matcher instantiate() {
    return SoDEmployeeAndVisitor.Matcher.create();
  }
  
  @Override
  public SoDEmployeeAndVisitor.Match newEmptyMatch() {
    return SoDEmployeeAndVisitor.Match.newEmptyMatch();
  }
  
  @Override
  public SoDEmployeeAndVisitor.Match newMatch(final Object... parameters) {
    return SoDEmployeeAndVisitor.Match.newMatch((com.hans.rbac.model.rbac.User) parameters[0], (com.hans.rbac.model.rbac.User) parameters[1], (com.hans.rbac.model.rbac.Role) parameters[2], (com.hans.rbac.model.rbac.Role) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link SoDEmployeeAndVisitor} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SoDEmployeeAndVisitor#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SoDEmployeeAndVisitor INSTANCE = new SoDEmployeeAndVisitor();
    
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
    private static final SoDEmployeeAndVisitor.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_userE = new PParameter("userE", "com.hans.rbac.model.rbac.User", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "User")), PParameterDirection.INOUT);
    
    private final PParameter parameter_userV = new PParameter("userV", "com.hans.rbac.model.rbac.User", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "User")), PParameterDirection.INOUT);
    
    private final PParameter parameter_employee = new PParameter("employee", "com.hans.rbac.model.rbac.Role", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Role")), PParameterDirection.INOUT);
    
    private final PParameter parameter_visitor = new PParameter("visitor", "com.hans.rbac.model.rbac.Role", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/rbac", "Role")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_userE, parameter_userV, parameter_employee, parameter_visitor);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.SoDEmployeeAndVisitor";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("userE","userV","employee","visitor");
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
          PVariable var_userE = body.getOrCreateVariableByName("userE");
          PVariable var_userV = body.getOrCreateVariableByName("userV");
          PVariable var_employee = body.getOrCreateVariableByName("employee");
          PVariable var_visitor = body.getOrCreateVariableByName("visitor");
          new TypeConstraint(body, Tuples.flatTupleOf(var_userE), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "User")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_userV), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "User")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_employee), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_visitor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_userE, parameter_userE),
             new ExportedParameter(body, var_userV, parameter_userV),
             new ExportedParameter(body, var_employee, parameter_employee),
             new ExportedParameter(body, var_visitor, parameter_visitor)
          ));
          //     Role.name(employee, "Employee")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "Employee");
          new TypeConstraint(body, Tuples.flatTupleOf(var_employee), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_employee, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Role", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          //     Role.name(visitor, "Visitor")
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, "Visitor");
          new TypeConstraint(body, Tuples.flatTupleOf(var_visitor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_visitor, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Role", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var__virtual_2_);
          //    	Role.RU(employee, userE)
          new TypeConstraint(body, Tuples.flatTupleOf(var_employee), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_employee, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Role", "RU")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "User")));
          new Equality(body, var__virtual_4_, var_userE);
          //    	Role.RU(visitor, userV)
          new TypeConstraint(body, Tuples.flatTupleOf(var_visitor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "Role")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_visitor, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/rbac", "Role", "RU")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/rbac", "User")));
          new Equality(body, var__virtual_5_, var_userV);
          //     userE==userV
          new Equality(body, var_userE, var_userV);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
