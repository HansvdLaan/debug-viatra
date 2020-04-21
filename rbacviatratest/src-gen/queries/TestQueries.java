/**
 * Generated from platform:/resource/rbacviatratest/src/queries/TestQueries.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import queries.AccessRelation;
import queries.DemarcationShouldHaveAPermission;
import queries.OnlyOneDirector;
import queries.OnlyOneOperationsManager;
import queries.OnlyOneRnDManager;
import queries.Policy;
import queries.PrerequisiteEverybodyHasAccessToLobby;
import queries.PrerequisiteVaultImpliesOpenOffice;
import queries.RoleName;
import queries.RoleShouldHaveADemarcation;
import queries.SoDEmployeeAndContractor;
import queries.SoDEmployeeAndVisitor;
import queries.UserShouldHaveARole;

/**
 * A pattern group formed of all public patterns defined in TestQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TestQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>policy</li>
 * <li>roleName</li>
 * <li>userShouldHaveARole</li>
 * <li>roleShouldHaveADemarcation</li>
 * <li>demarcationShouldHaveAPermission</li>
 * <li>onlyOneDirector</li>
 * <li>onlyOneRnDManager</li>
 * <li>onlyOneOperationsManager</li>
 * <li>SoDEmployeeAndContractor</li>
 * <li>SoDEmployeeAndVisitor</li>
 * <li>PrerequisiteEverybodyHasAccessToLobby</li>
 * <li>PrerequisiteVaultImpliesOpenOffice</li>
 * <li>accessRelation</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TestQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TestQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new TestQueries();
    }
    return INSTANCE;
  }
  
  private static TestQueries INSTANCE;
  
  private TestQueries() {
    querySpecifications.add(Policy.instance());
    querySpecifications.add(RoleName.instance());
    querySpecifications.add(UserShouldHaveARole.instance());
    querySpecifications.add(RoleShouldHaveADemarcation.instance());
    querySpecifications.add(DemarcationShouldHaveAPermission.instance());
    querySpecifications.add(OnlyOneDirector.instance());
    querySpecifications.add(OnlyOneRnDManager.instance());
    querySpecifications.add(OnlyOneOperationsManager.instance());
    querySpecifications.add(SoDEmployeeAndContractor.instance());
    querySpecifications.add(SoDEmployeeAndVisitor.instance());
    querySpecifications.add(PrerequisiteEverybodyHasAccessToLobby.instance());
    querySpecifications.add(PrerequisiteVaultImpliesOpenOffice.instance());
    querySpecifications.add(AccessRelation.instance());
  }
  
  public Policy getPolicy() {
    return Policy.instance();
  }
  
  public Policy.Matcher getPolicy(final ViatraQueryEngine engine) {
    return Policy.Matcher.on(engine);
  }
  
  public RoleName getRoleName() {
    return RoleName.instance();
  }
  
  public RoleName.Matcher getRoleName(final ViatraQueryEngine engine) {
    return RoleName.Matcher.on(engine);
  }
  
  public UserShouldHaveARole getUserShouldHaveARole() {
    return UserShouldHaveARole.instance();
  }
  
  public UserShouldHaveARole.Matcher getUserShouldHaveARole(final ViatraQueryEngine engine) {
    return UserShouldHaveARole.Matcher.on(engine);
  }
  
  public RoleShouldHaveADemarcation getRoleShouldHaveADemarcation() {
    return RoleShouldHaveADemarcation.instance();
  }
  
  public RoleShouldHaveADemarcation.Matcher getRoleShouldHaveADemarcation(final ViatraQueryEngine engine) {
    return RoleShouldHaveADemarcation.Matcher.on(engine);
  }
  
  public DemarcationShouldHaveAPermission getDemarcationShouldHaveAPermission() {
    return DemarcationShouldHaveAPermission.instance();
  }
  
  public DemarcationShouldHaveAPermission.Matcher getDemarcationShouldHaveAPermission(final ViatraQueryEngine engine) {
    return DemarcationShouldHaveAPermission.Matcher.on(engine);
  }
  
  public OnlyOneDirector getOnlyOneDirector() {
    return OnlyOneDirector.instance();
  }
  
  public OnlyOneDirector.Matcher getOnlyOneDirector(final ViatraQueryEngine engine) {
    return OnlyOneDirector.Matcher.on(engine);
  }
  
  public OnlyOneRnDManager getOnlyOneRnDManager() {
    return OnlyOneRnDManager.instance();
  }
  
  public OnlyOneRnDManager.Matcher getOnlyOneRnDManager(final ViatraQueryEngine engine) {
    return OnlyOneRnDManager.Matcher.on(engine);
  }
  
  public OnlyOneOperationsManager getOnlyOneOperationsManager() {
    return OnlyOneOperationsManager.instance();
  }
  
  public OnlyOneOperationsManager.Matcher getOnlyOneOperationsManager(final ViatraQueryEngine engine) {
    return OnlyOneOperationsManager.Matcher.on(engine);
  }
  
  public SoDEmployeeAndContractor getSoDEmployeeAndContractor() {
    return SoDEmployeeAndContractor.instance();
  }
  
  public SoDEmployeeAndContractor.Matcher getSoDEmployeeAndContractor(final ViatraQueryEngine engine) {
    return SoDEmployeeAndContractor.Matcher.on(engine);
  }
  
  public SoDEmployeeAndVisitor getSoDEmployeeAndVisitor() {
    return SoDEmployeeAndVisitor.instance();
  }
  
  public SoDEmployeeAndVisitor.Matcher getSoDEmployeeAndVisitor(final ViatraQueryEngine engine) {
    return SoDEmployeeAndVisitor.Matcher.on(engine);
  }
  
  public PrerequisiteEverybodyHasAccessToLobby getPrerequisiteEverybodyHasAccessToLobby() {
    return PrerequisiteEverybodyHasAccessToLobby.instance();
  }
  
  public PrerequisiteEverybodyHasAccessToLobby.Matcher getPrerequisiteEverybodyHasAccessToLobby(final ViatraQueryEngine engine) {
    return PrerequisiteEverybodyHasAccessToLobby.Matcher.on(engine);
  }
  
  public PrerequisiteVaultImpliesOpenOffice getPrerequisiteVaultImpliesOpenOffice() {
    return PrerequisiteVaultImpliesOpenOffice.instance();
  }
  
  public PrerequisiteVaultImpliesOpenOffice.Matcher getPrerequisiteVaultImpliesOpenOffice(final ViatraQueryEngine engine) {
    return PrerequisiteVaultImpliesOpenOffice.Matcher.on(engine);
  }
  
  public AccessRelation getAccessRelation() {
    return AccessRelation.instance();
  }
  
  public AccessRelation.Matcher getAccessRelation(final ViatraQueryEngine engine) {
    return AccessRelation.Matcher.on(engine);
  }
}
