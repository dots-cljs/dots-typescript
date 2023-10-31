(ns dots.typescript.list-format
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/ListFormat))

(def single-line (.-SingleLine typescript/ListFormat))

(def multi-line (.-MultiLine typescript/ListFormat))

(def preserve-lines (.-PreserveLines typescript/ListFormat))

(def lines-mask (.-LinesMask typescript/ListFormat))

(def not-delimited (.-NotDelimited typescript/ListFormat))

(def bar-delimited (.-BarDelimited typescript/ListFormat))

(def ampersand-delimited (.-AmpersandDelimited typescript/ListFormat))

(def comma-delimited (.-CommaDelimited typescript/ListFormat))

(def asterisk-delimited (.-AsteriskDelimited typescript/ListFormat))

(def delimiters-mask (.-DelimitersMask typescript/ListFormat))

(def allow-trailing-comma (.-AllowTrailingComma typescript/ListFormat))

(def indented (.-Indented typescript/ListFormat))

(def space-between-braces (.-SpaceBetweenBraces typescript/ListFormat))

(def space-between-siblings (.-SpaceBetweenSiblings typescript/ListFormat))

(def braces (.-Braces typescript/ListFormat))

(def parenthesis (.-Parenthesis typescript/ListFormat))

(def angle-brackets (.-AngleBrackets typescript/ListFormat))

(def square-brackets (.-SquareBrackets typescript/ListFormat))

(def brackets-mask (.-BracketsMask typescript/ListFormat))

(def optional-if-undefined (.-OptionalIfUndefined typescript/ListFormat))

(def optional-if-empty (.-OptionalIfEmpty typescript/ListFormat))

(def optional (.-Optional typescript/ListFormat))

(def prefer-new-line (.-PreferNewLine typescript/ListFormat))

(def no-trailing-new-line (.-NoTrailingNewLine typescript/ListFormat))

(def no-intervening-comments (.-NoInterveningComments typescript/ListFormat))

(def no-space-if-empty (.-NoSpaceIfEmpty typescript/ListFormat))

(def single-element (.-SingleElement typescript/ListFormat))

(def space-after-list (.-SpaceAfterList typescript/ListFormat))

(def modifiers (.-Modifiers typescript/ListFormat))

(def heritage-clauses (.-HeritageClauses typescript/ListFormat))

(def single-line-type-literal-members (.-SingleLineTypeLiteralMembers typescript/ListFormat))

(def multi-line-type-literal-members (.-MultiLineTypeLiteralMembers typescript/ListFormat))

(def single-line-tuple-type-elements (.-SingleLineTupleTypeElements typescript/ListFormat))

(def multi-line-tuple-type-elements (.-MultiLineTupleTypeElements typescript/ListFormat))

(def union-type-constituents (.-UnionTypeConstituents typescript/ListFormat))

(def intersection-type-constituents (.-IntersectionTypeConstituents typescript/ListFormat))

(def object-binding-pattern-elements (.-ObjectBindingPatternElements typescript/ListFormat))

(def array-binding-pattern-elements (.-ArrayBindingPatternElements typescript/ListFormat))

(def object-literal-expression-properties (.-ObjectLiteralExpressionProperties typescript/ListFormat))

(def import-clause-entries (.-ImportClauseEntries typescript/ListFormat))

(def array-literal-expression-elements (.-ArrayLiteralExpressionElements typescript/ListFormat))

(def comma-list-elements (.-CommaListElements typescript/ListFormat))

(def call-expression-arguments (.-CallExpressionArguments typescript/ListFormat))

(def new-expression-arguments (.-NewExpressionArguments typescript/ListFormat))

(def template-expression-spans (.-TemplateExpressionSpans typescript/ListFormat))

(def single-line-block-statements (.-SingleLineBlockStatements typescript/ListFormat))

(def multi-line-block-statements (.-MultiLineBlockStatements typescript/ListFormat))

(def variable-declaration-list (.-VariableDeclarationList typescript/ListFormat))

(def single-line-function-body-statements (.-SingleLineFunctionBodyStatements typescript/ListFormat))

(def multi-line-function-body-statements (.-MultiLineFunctionBodyStatements typescript/ListFormat))

(def class-heritage-clauses (.-ClassHeritageClauses typescript/ListFormat))

(def class-members (.-ClassMembers typescript/ListFormat))

(def interface-members (.-InterfaceMembers typescript/ListFormat))

(def enum-members (.-EnumMembers typescript/ListFormat))

(def case-block-clauses (.-CaseBlockClauses typescript/ListFormat))

(def named-imports-or-exports-elements (.-NamedImportsOrExportsElements typescript/ListFormat))

(def jsx-element-or-fragment-children (.-JsxElementOrFragmentChildren typescript/ListFormat))

(def jsx-element-attributes (.-JsxElementAttributes typescript/ListFormat))

(def case-or-default-clause-statements (.-CaseOrDefaultClauseStatements typescript/ListFormat))

(def heritage-clause-types (.-HeritageClauseTypes typescript/ListFormat))

(def source-file-statements (.-SourceFileStatements typescript/ListFormat))

(def decorators (.-Decorators typescript/ListFormat))

(def type-arguments (.-TypeArguments typescript/ListFormat))

(def type-parameters (.-TypeParameters typescript/ListFormat))

(def parameters (.-Parameters typescript/ListFormat))

(def index-signature-parameters (.-IndexSignatureParameters typescript/ListFormat))

(def js-doc-comment (.-JSDocComment typescript/ListFormat))
