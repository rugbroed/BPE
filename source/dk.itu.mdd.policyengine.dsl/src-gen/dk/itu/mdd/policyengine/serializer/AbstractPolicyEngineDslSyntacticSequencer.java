package dk.itu.mdd.policyengine.serializer;

import com.google.inject.Inject;
import dk.itu.mdd.policyengine.services.PolicyEngineDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractPolicyEngineDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PolicyEngineDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Policy_UsesActuatorsKeyword_4_0_q;
	protected AbstractElementAlias match_Policy_UsesSensorsKeyword_3_0_q;
	protected AbstractElementAlias match_Policy___IsSpecifiedByKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_Room_DuringAlwaysKeyword_3_3_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PolicyEngineDslGrammarAccess) access;
		match_Policy_UsesActuatorsKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getPolicyAccess().getUsesActuatorsKeyword_4_0());
		match_Policy_UsesSensorsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getPolicyAccess().getUsesSensorsKeyword_3_0());
		match_Policy___IsSpecifiedByKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPolicyAccess().getIsSpecifiedByKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_5_3()));
		match_Room_DuringAlwaysKeyword_3_3_1_q = new TokenAlias(false, true, grammarAccess.getRoomAccess().getDuringAlwaysKeyword_3_3_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEBooleanRule())
			return getEBooleanToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * EBoolean returns ecore::EBoolean:
	 * 	'true' | 'false';
	 */
	protected String getEBooleanToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Policy_UsesActuatorsKeyword_4_0_q.equals(syntax))
				emit_Policy_UsesActuatorsKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Policy_UsesSensorsKeyword_3_0_q.equals(syntax))
				emit_Policy_UsesSensorsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Policy___IsSpecifiedByKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_Policy___IsSpecifiedByKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Room_DuringAlwaysKeyword_3_3_1_q.equals(syntax))
				emit_Room_DuringAlwaysKeyword_3_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'uses actuators'?
	 */
	protected void emit_Policy_UsesActuatorsKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'uses sensors'?
	 */
	protected void emit_Policy_UsesSensorsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is specified by' '{' '}')?
	 */
	protected void emit_Policy___IsSpecifiedByKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'during-always'?
	 */
	protected void emit_Room_DuringAlwaysKeyword_3_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
