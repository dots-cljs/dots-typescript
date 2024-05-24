(ns dots.typescript.syntax-kind
  (:refer-clojure :exclude [count keyword])
  (:require ["typescript" :as typescript]))

(def unknown (.-Unknown typescript/SyntaxKind))

(def end-of-file-token (.-EndOfFileToken typescript/SyntaxKind))

(def single-line-comment-trivia (.-SingleLineCommentTrivia typescript/SyntaxKind))

(def multi-line-comment-trivia (.-MultiLineCommentTrivia typescript/SyntaxKind))

(def new-line-trivia (.-NewLineTrivia typescript/SyntaxKind))

(def whitespace-trivia (.-WhitespaceTrivia typescript/SyntaxKind))

(def shebang-trivia (.-ShebangTrivia typescript/SyntaxKind))

(def conflict-marker-trivia (.-ConflictMarkerTrivia typescript/SyntaxKind))

(def non-text-file-marker-trivia (.-NonTextFileMarkerTrivia typescript/SyntaxKind))

(def numeric-literal (.-NumericLiteral typescript/SyntaxKind))

(def big-int-literal (.-BigIntLiteral typescript/SyntaxKind))

(def string-literal (.-StringLiteral typescript/SyntaxKind))

(def jsx-text (.-JsxText typescript/SyntaxKind))

(def jsx-text-all-white-spaces (.-JsxTextAllWhiteSpaces typescript/SyntaxKind))

(def regular-expression-literal (.-RegularExpressionLiteral typescript/SyntaxKind))

(def no-substitution-template-literal (.-NoSubstitutionTemplateLiteral typescript/SyntaxKind))

(def template-head (.-TemplateHead typescript/SyntaxKind))

(def template-middle (.-TemplateMiddle typescript/SyntaxKind))

(def template-tail (.-TemplateTail typescript/SyntaxKind))

(def open-brace-token (.-OpenBraceToken typescript/SyntaxKind))

(def close-brace-token (.-CloseBraceToken typescript/SyntaxKind))

(def open-paren-token (.-OpenParenToken typescript/SyntaxKind))

(def close-paren-token (.-CloseParenToken typescript/SyntaxKind))

(def open-bracket-token (.-OpenBracketToken typescript/SyntaxKind))

(def close-bracket-token (.-CloseBracketToken typescript/SyntaxKind))

(def dot-token (.-DotToken typescript/SyntaxKind))

(def dot-dot-dot-token (.-DotDotDotToken typescript/SyntaxKind))

(def semicolon-token (.-SemicolonToken typescript/SyntaxKind))

(def comma-token (.-CommaToken typescript/SyntaxKind))

(def question-dot-token (.-QuestionDotToken typescript/SyntaxKind))

(def less-than-token (.-LessThanToken typescript/SyntaxKind))

(def less-than-slash-token (.-LessThanSlashToken typescript/SyntaxKind))

(def greater-than-token (.-GreaterThanToken typescript/SyntaxKind))

(def less-than-equals-token (.-LessThanEqualsToken typescript/SyntaxKind))

(def greater-than-equals-token (.-GreaterThanEqualsToken typescript/SyntaxKind))

(def equals-equals-token (.-EqualsEqualsToken typescript/SyntaxKind))

(def exclamation-equals-token (.-ExclamationEqualsToken typescript/SyntaxKind))

(def equals-equals-equals-token (.-EqualsEqualsEqualsToken typescript/SyntaxKind))

(def exclamation-equals-equals-token (.-ExclamationEqualsEqualsToken typescript/SyntaxKind))

(def equals-greater-than-token (.-EqualsGreaterThanToken typescript/SyntaxKind))

(def plus-token (.-PlusToken typescript/SyntaxKind))

(def minus-token (.-MinusToken typescript/SyntaxKind))

(def asterisk-token (.-AsteriskToken typescript/SyntaxKind))

(def asterisk-asterisk-token (.-AsteriskAsteriskToken typescript/SyntaxKind))

(def slash-token (.-SlashToken typescript/SyntaxKind))

(def percent-token (.-PercentToken typescript/SyntaxKind))

(def plus-plus-token (.-PlusPlusToken typescript/SyntaxKind))

(def minus-minus-token (.-MinusMinusToken typescript/SyntaxKind))

(def less-than-less-than-token (.-LessThanLessThanToken typescript/SyntaxKind))

(def greater-than-greater-than-token (.-GreaterThanGreaterThanToken typescript/SyntaxKind))

(def greater-than-greater-than-greater-than-token (.-GreaterThanGreaterThanGreaterThanToken typescript/SyntaxKind))

(def ampersand-token (.-AmpersandToken typescript/SyntaxKind))

(def bar-token (.-BarToken typescript/SyntaxKind))

(def caret-token (.-CaretToken typescript/SyntaxKind))

(def exclamation-token (.-ExclamationToken typescript/SyntaxKind))

(def tilde-token (.-TildeToken typescript/SyntaxKind))

(def ampersand-ampersand-token (.-AmpersandAmpersandToken typescript/SyntaxKind))

(def bar-bar-token (.-BarBarToken typescript/SyntaxKind))

(def question-token (.-QuestionToken typescript/SyntaxKind))

(def colon-token (.-ColonToken typescript/SyntaxKind))

(def at-token (.-AtToken typescript/SyntaxKind))

(def question-question-token (.-QuestionQuestionToken typescript/SyntaxKind))

(def backtick-token
  "Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds."
  (.-BacktickToken typescript/SyntaxKind))

(def hash-token
  "Only the JSDoc scanner produces HashToken. The normal scanner produces PrivateIdentifier."
  (.-HashToken typescript/SyntaxKind))

(def equals-token (.-EqualsToken typescript/SyntaxKind))

(def plus-equals-token (.-PlusEqualsToken typescript/SyntaxKind))

(def minus-equals-token (.-MinusEqualsToken typescript/SyntaxKind))

(def asterisk-equals-token (.-AsteriskEqualsToken typescript/SyntaxKind))

(def asterisk-asterisk-equals-token (.-AsteriskAsteriskEqualsToken typescript/SyntaxKind))

(def slash-equals-token (.-SlashEqualsToken typescript/SyntaxKind))

(def percent-equals-token (.-PercentEqualsToken typescript/SyntaxKind))

(def less-than-less-than-equals-token (.-LessThanLessThanEqualsToken typescript/SyntaxKind))

(def greater-than-greater-than-equals-token (.-GreaterThanGreaterThanEqualsToken typescript/SyntaxKind))

(def greater-than-greater-than-greater-than-equals-token (.-GreaterThanGreaterThanGreaterThanEqualsToken typescript/SyntaxKind))

(def ampersand-equals-token (.-AmpersandEqualsToken typescript/SyntaxKind))

(def bar-equals-token (.-BarEqualsToken typescript/SyntaxKind))

(def bar-bar-equals-token (.-BarBarEqualsToken typescript/SyntaxKind))

(def ampersand-ampersand-equals-token (.-AmpersandAmpersandEqualsToken typescript/SyntaxKind))

(def question-question-equals-token (.-QuestionQuestionEqualsToken typescript/SyntaxKind))

(def caret-equals-token (.-CaretEqualsToken typescript/SyntaxKind))

(def identifier (.-Identifier typescript/SyntaxKind))

(def private-identifier (.-PrivateIdentifier typescript/SyntaxKind))

(def break-keyword (.-BreakKeyword typescript/SyntaxKind))

(def case-keyword (.-CaseKeyword typescript/SyntaxKind))

(def catch-keyword (.-CatchKeyword typescript/SyntaxKind))

(def class-keyword (.-ClassKeyword typescript/SyntaxKind))

(def const-keyword (.-ConstKeyword typescript/SyntaxKind))

(def continue-keyword (.-ContinueKeyword typescript/SyntaxKind))

(def debugger-keyword (.-DebuggerKeyword typescript/SyntaxKind))

(def default-keyword (.-DefaultKeyword typescript/SyntaxKind))

(def delete-keyword (.-DeleteKeyword typescript/SyntaxKind))

(def do-keyword (.-DoKeyword typescript/SyntaxKind))

(def else-keyword (.-ElseKeyword typescript/SyntaxKind))

(def enum-keyword (.-EnumKeyword typescript/SyntaxKind))

(def export-keyword (.-ExportKeyword typescript/SyntaxKind))

(def extends-keyword (.-ExtendsKeyword typescript/SyntaxKind))

(def false-keyword (.-FalseKeyword typescript/SyntaxKind))

(def finally-keyword (.-FinallyKeyword typescript/SyntaxKind))

(def for-keyword (.-ForKeyword typescript/SyntaxKind))

(def function-keyword (.-FunctionKeyword typescript/SyntaxKind))

(def if-keyword (.-IfKeyword typescript/SyntaxKind))

(def import-keyword (.-ImportKeyword typescript/SyntaxKind))

(def in-keyword (.-InKeyword typescript/SyntaxKind))

(def instance-of-keyword (.-InstanceOfKeyword typescript/SyntaxKind))

(def new-keyword (.-NewKeyword typescript/SyntaxKind))

(def null-keyword (.-NullKeyword typescript/SyntaxKind))

(def return-keyword (.-ReturnKeyword typescript/SyntaxKind))

(def super-keyword (.-SuperKeyword typescript/SyntaxKind))

(def switch-keyword (.-SwitchKeyword typescript/SyntaxKind))

(def this-keyword (.-ThisKeyword typescript/SyntaxKind))

(def throw-keyword (.-ThrowKeyword typescript/SyntaxKind))

(def true-keyword (.-TrueKeyword typescript/SyntaxKind))

(def try-keyword (.-TryKeyword typescript/SyntaxKind))

(def type-of-keyword (.-TypeOfKeyword typescript/SyntaxKind))

(def var-keyword (.-VarKeyword typescript/SyntaxKind))

(def void-keyword (.-VoidKeyword typescript/SyntaxKind))

(def while-keyword (.-WhileKeyword typescript/SyntaxKind))

(def with-keyword (.-WithKeyword typescript/SyntaxKind))

(def implements-keyword (.-ImplementsKeyword typescript/SyntaxKind))

(def interface-keyword (.-InterfaceKeyword typescript/SyntaxKind))

(def let-keyword (.-LetKeyword typescript/SyntaxKind))

(def package-keyword (.-PackageKeyword typescript/SyntaxKind))

(def private-keyword (.-PrivateKeyword typescript/SyntaxKind))

(def protected-keyword (.-ProtectedKeyword typescript/SyntaxKind))

(def public-keyword (.-PublicKeyword typescript/SyntaxKind))

(def static-keyword (.-StaticKeyword typescript/SyntaxKind))

(def yield-keyword (.-YieldKeyword typescript/SyntaxKind))

(def abstract-keyword (.-AbstractKeyword typescript/SyntaxKind))

(def accessor-keyword (.-AccessorKeyword typescript/SyntaxKind))

(def as-keyword (.-AsKeyword typescript/SyntaxKind))

(def asserts-keyword (.-AssertsKeyword typescript/SyntaxKind))

(def assert-keyword (.-AssertKeyword typescript/SyntaxKind))

(def any-keyword (.-AnyKeyword typescript/SyntaxKind))

(def async-keyword (.-AsyncKeyword typescript/SyntaxKind))

(def await-keyword (.-AwaitKeyword typescript/SyntaxKind))

(def boolean-keyword (.-BooleanKeyword typescript/SyntaxKind))

(def constructor-keyword (.-ConstructorKeyword typescript/SyntaxKind))

(def declare-keyword (.-DeclareKeyword typescript/SyntaxKind))

(def infer-keyword (.-InferKeyword typescript/SyntaxKind))

(def intrinsic-keyword (.-IntrinsicKeyword typescript/SyntaxKind))

(def keyword (.-IsKeyword typescript/SyntaxKind))

(def key-of-keyword (.-KeyOfKeyword typescript/SyntaxKind))

(def module-keyword (.-ModuleKeyword typescript/SyntaxKind))

(def namespace-keyword (.-NamespaceKeyword typescript/SyntaxKind))

(def never-keyword (.-NeverKeyword typescript/SyntaxKind))

(def out-keyword (.-OutKeyword typescript/SyntaxKind))

(def readonly-keyword (.-ReadonlyKeyword typescript/SyntaxKind))

(def require-keyword (.-RequireKeyword typescript/SyntaxKind))

(def number-keyword (.-NumberKeyword typescript/SyntaxKind))

(def object-keyword (.-ObjectKeyword typescript/SyntaxKind))

(def satisfies-keyword (.-SatisfiesKeyword typescript/SyntaxKind))

(def set-keyword (.-SetKeyword typescript/SyntaxKind))

(def string-keyword (.-StringKeyword typescript/SyntaxKind))

(def symbol-keyword (.-SymbolKeyword typescript/SyntaxKind))

(def type-keyword (.-TypeKeyword typescript/SyntaxKind))

(def undefined-keyword (.-UndefinedKeyword typescript/SyntaxKind))

(def unique-keyword (.-UniqueKeyword typescript/SyntaxKind))

(def unknown-keyword (.-UnknownKeyword typescript/SyntaxKind))

(def using-keyword (.-UsingKeyword typescript/SyntaxKind))

(def from-keyword (.-FromKeyword typescript/SyntaxKind))

(def global-keyword (.-GlobalKeyword typescript/SyntaxKind))

(def big-int-keyword (.-BigIntKeyword typescript/SyntaxKind))

(def override-keyword (.-OverrideKeyword typescript/SyntaxKind))

(def of-keyword (.-OfKeyword typescript/SyntaxKind))

(def qualified-name (.-QualifiedName typescript/SyntaxKind))

(def computed-property-name (.-ComputedPropertyName typescript/SyntaxKind))

(def type-parameter (.-TypeParameter typescript/SyntaxKind))

(def parameter (.-Parameter typescript/SyntaxKind))

(def decorator (.-Decorator typescript/SyntaxKind))

(def property-signature (.-PropertySignature typescript/SyntaxKind))

(def property-declaration (.-PropertyDeclaration typescript/SyntaxKind))

(def method-signature (.-MethodSignature typescript/SyntaxKind))

(def method-declaration (.-MethodDeclaration typescript/SyntaxKind))

(def class-static-block-declaration (.-ClassStaticBlockDeclaration typescript/SyntaxKind))

(def constructor (.-Constructor typescript/SyntaxKind))

(def accessor (.-GetAccessor typescript/SyntaxKind))

(def set-accessor (.-SetAccessor typescript/SyntaxKind))

(def call-signature (.-CallSignature typescript/SyntaxKind))

(def construct-signature (.-ConstructSignature typescript/SyntaxKind))

(def index-signature (.-IndexSignature typescript/SyntaxKind))

(def type-predicate (.-TypePredicate typescript/SyntaxKind))

(def type-reference (.-TypeReference typescript/SyntaxKind))

(def function-type (.-FunctionType typescript/SyntaxKind))

(def constructor-type (.-ConstructorType typescript/SyntaxKind))

(def type-query (.-TypeQuery typescript/SyntaxKind))

(def type-literal (.-TypeLiteral typescript/SyntaxKind))

(def array-type (.-ArrayType typescript/SyntaxKind))

(def tuple-type (.-TupleType typescript/SyntaxKind))

(def optional-type (.-OptionalType typescript/SyntaxKind))

(def rest-type (.-RestType typescript/SyntaxKind))

(def union-type (.-UnionType typescript/SyntaxKind))

(def intersection-type (.-IntersectionType typescript/SyntaxKind))

(def conditional-type (.-ConditionalType typescript/SyntaxKind))

(def infer-type (.-InferType typescript/SyntaxKind))

(def parenthesized-type (.-ParenthesizedType typescript/SyntaxKind))

(def this-type (.-ThisType typescript/SyntaxKind))

(def type-operator (.-TypeOperator typescript/SyntaxKind))

(def indexed-access-type (.-IndexedAccessType typescript/SyntaxKind))

(def mapped-type (.-MappedType typescript/SyntaxKind))

(def literal-type (.-LiteralType typescript/SyntaxKind))

(def named-tuple-member (.-NamedTupleMember typescript/SyntaxKind))

(def template-literal-type (.-TemplateLiteralType typescript/SyntaxKind))

(def template-literal-type-span (.-TemplateLiteralTypeSpan typescript/SyntaxKind))

(def import-type (.-ImportType typescript/SyntaxKind))

(def object-binding-pattern (.-ObjectBindingPattern typescript/SyntaxKind))

(def array-binding-pattern (.-ArrayBindingPattern typescript/SyntaxKind))

(def binding-element (.-BindingElement typescript/SyntaxKind))

(def array-literal-expression (.-ArrayLiteralExpression typescript/SyntaxKind))

(def object-literal-expression (.-ObjectLiteralExpression typescript/SyntaxKind))

(def property-access-expression (.-PropertyAccessExpression typescript/SyntaxKind))

(def element-access-expression (.-ElementAccessExpression typescript/SyntaxKind))

(def call-expression (.-CallExpression typescript/SyntaxKind))

(def new-expression (.-NewExpression typescript/SyntaxKind))

(def tagged-template-expression (.-TaggedTemplateExpression typescript/SyntaxKind))

(def type-assertion-expression (.-TypeAssertionExpression typescript/SyntaxKind))

(def parenthesized-expression (.-ParenthesizedExpression typescript/SyntaxKind))

(def function-expression (.-FunctionExpression typescript/SyntaxKind))

(def arrow-function (.-ArrowFunction typescript/SyntaxKind))

(def delete-expression (.-DeleteExpression typescript/SyntaxKind))

(def type-of-expression (.-TypeOfExpression typescript/SyntaxKind))

(def void-expression (.-VoidExpression typescript/SyntaxKind))

(def await-expression (.-AwaitExpression typescript/SyntaxKind))

(def prefix-unary-expression (.-PrefixUnaryExpression typescript/SyntaxKind))

(def postfix-unary-expression (.-PostfixUnaryExpression typescript/SyntaxKind))

(def binary-expression (.-BinaryExpression typescript/SyntaxKind))

(def conditional-expression (.-ConditionalExpression typescript/SyntaxKind))

(def template-expression (.-TemplateExpression typescript/SyntaxKind))

(def yield-expression (.-YieldExpression typescript/SyntaxKind))

(def spread-element (.-SpreadElement typescript/SyntaxKind))

(def class-expression (.-ClassExpression typescript/SyntaxKind))

(def omitted-expression (.-OmittedExpression typescript/SyntaxKind))

(def expression-with-type-arguments (.-ExpressionWithTypeArguments typescript/SyntaxKind))

(def as-expression (.-AsExpression typescript/SyntaxKind))

(def non-null-expression (.-NonNullExpression typescript/SyntaxKind))

(def meta-property (.-MetaProperty typescript/SyntaxKind))

(def synthetic-expression (.-SyntheticExpression typescript/SyntaxKind))

(def satisfies-expression (.-SatisfiesExpression typescript/SyntaxKind))

(def template-span (.-TemplateSpan typescript/SyntaxKind))

(def semicolon-class-element (.-SemicolonClassElement typescript/SyntaxKind))

(def block (.-Block typescript/SyntaxKind))

(def empty-statement (.-EmptyStatement typescript/SyntaxKind))

(def variable-statement (.-VariableStatement typescript/SyntaxKind))

(def expression-statement (.-ExpressionStatement typescript/SyntaxKind))

(def if-statement (.-IfStatement typescript/SyntaxKind))

(def do-statement (.-DoStatement typescript/SyntaxKind))

(def while-statement (.-WhileStatement typescript/SyntaxKind))

(def for-statement (.-ForStatement typescript/SyntaxKind))

(def for-in-statement (.-ForInStatement typescript/SyntaxKind))

(def for-of-statement (.-ForOfStatement typescript/SyntaxKind))

(def continue-statement (.-ContinueStatement typescript/SyntaxKind))

(def break-statement (.-BreakStatement typescript/SyntaxKind))

(def return-statement (.-ReturnStatement typescript/SyntaxKind))

(def with-statement (.-WithStatement typescript/SyntaxKind))

(def switch-statement (.-SwitchStatement typescript/SyntaxKind))

(def labeled-statement (.-LabeledStatement typescript/SyntaxKind))

(def throw-statement (.-ThrowStatement typescript/SyntaxKind))

(def try-statement (.-TryStatement typescript/SyntaxKind))

(def debugger-statement (.-DebuggerStatement typescript/SyntaxKind))

(def variable-declaration (.-VariableDeclaration typescript/SyntaxKind))

(def variable-declaration-list (.-VariableDeclarationList typescript/SyntaxKind))

(def function-declaration (.-FunctionDeclaration typescript/SyntaxKind))

(def class-declaration (.-ClassDeclaration typescript/SyntaxKind))

(def interface-declaration (.-InterfaceDeclaration typescript/SyntaxKind))

(def type-alias-declaration (.-TypeAliasDeclaration typescript/SyntaxKind))

(def enum-declaration (.-EnumDeclaration typescript/SyntaxKind))

(def module-declaration (.-ModuleDeclaration typescript/SyntaxKind))

(def module-block (.-ModuleBlock typescript/SyntaxKind))

(def case-block (.-CaseBlock typescript/SyntaxKind))

(def namespace-export-declaration (.-NamespaceExportDeclaration typescript/SyntaxKind))

(def import-equals-declaration (.-ImportEqualsDeclaration typescript/SyntaxKind))

(def import-declaration (.-ImportDeclaration typescript/SyntaxKind))

(def import-clause (.-ImportClause typescript/SyntaxKind))

(def namespace-import (.-NamespaceImport typescript/SyntaxKind))

(def named-imports (.-NamedImports typescript/SyntaxKind))

(def import-specifier (.-ImportSpecifier typescript/SyntaxKind))

(def export-assignment (.-ExportAssignment typescript/SyntaxKind))

(def export-declaration (.-ExportDeclaration typescript/SyntaxKind))

(def named-exports (.-NamedExports typescript/SyntaxKind))

(def namespace-export (.-NamespaceExport typescript/SyntaxKind))

(def export-specifier (.-ExportSpecifier typescript/SyntaxKind))

(def missing-declaration (.-MissingDeclaration typescript/SyntaxKind))

(def external-module-reference (.-ExternalModuleReference typescript/SyntaxKind))

(def jsx-element (.-JsxElement typescript/SyntaxKind))

(def jsx-self-closing-element (.-JsxSelfClosingElement typescript/SyntaxKind))

(def jsx-opening-element (.-JsxOpeningElement typescript/SyntaxKind))

(def jsx-closing-element (.-JsxClosingElement typescript/SyntaxKind))

(def jsx-fragment (.-JsxFragment typescript/SyntaxKind))

(def jsx-opening-fragment (.-JsxOpeningFragment typescript/SyntaxKind))

(def jsx-closing-fragment (.-JsxClosingFragment typescript/SyntaxKind))

(def jsx-attribute (.-JsxAttribute typescript/SyntaxKind))

(def jsx-attributes (.-JsxAttributes typescript/SyntaxKind))

(def jsx-spread-attribute (.-JsxSpreadAttribute typescript/SyntaxKind))

(def jsx-expression (.-JsxExpression typescript/SyntaxKind))

(def jsx-namespaced-name (.-JsxNamespacedName typescript/SyntaxKind))

(def case-clause (.-CaseClause typescript/SyntaxKind))

(def default-clause (.-DefaultClause typescript/SyntaxKind))

(def heritage-clause (.-HeritageClause typescript/SyntaxKind))

(def catch-clause (.-CatchClause typescript/SyntaxKind))

(def import-attributes (.-ImportAttributes typescript/SyntaxKind))

(def import-attribute (.-ImportAttribute typescript/SyntaxKind))

(def assert-clause (.-AssertClause typescript/SyntaxKind))

(def assert-entry (.-AssertEntry typescript/SyntaxKind))

(def import-type-assertion-container (.-ImportTypeAssertionContainer typescript/SyntaxKind))

(def property-assignment (.-PropertyAssignment typescript/SyntaxKind))

(def shorthand-property-assignment (.-ShorthandPropertyAssignment typescript/SyntaxKind))

(def spread-assignment (.-SpreadAssignment typescript/SyntaxKind))

(def enum-member (.-EnumMember typescript/SyntaxKind))

(def unparsed-prologue (.-UnparsedPrologue typescript/SyntaxKind))

(def unparsed-prepend (.-UnparsedPrepend typescript/SyntaxKind))

(def unparsed-text (.-UnparsedText typescript/SyntaxKind))

(def unparsed-internal-text (.-UnparsedInternalText typescript/SyntaxKind))

(def unparsed-synthetic-reference (.-UnparsedSyntheticReference typescript/SyntaxKind))

(def source-file (.-SourceFile typescript/SyntaxKind))

(def bundle (.-Bundle typescript/SyntaxKind))

(def unparsed-source (.-UnparsedSource typescript/SyntaxKind))

(def input-files (.-InputFiles typescript/SyntaxKind))

(def js-doc-type-expression (.-JSDocTypeExpression typescript/SyntaxKind))

(def js-doc-name-reference (.-JSDocNameReference typescript/SyntaxKind))

(def js-doc-member-name (.-JSDocMemberName typescript/SyntaxKind))

(def js-doc-all-type (.-JSDocAllType typescript/SyntaxKind))

(def js-doc-unknown-type (.-JSDocUnknownType typescript/SyntaxKind))

(def js-doc-nullable-type (.-JSDocNullableType typescript/SyntaxKind))

(def js-doc-non-nullable-type (.-JSDocNonNullableType typescript/SyntaxKind))

(def js-doc-optional-type (.-JSDocOptionalType typescript/SyntaxKind))

(def js-doc-function-type (.-JSDocFunctionType typescript/SyntaxKind))

(def js-doc-variadic-type (.-JSDocVariadicType typescript/SyntaxKind))

(def js-doc-namepath-type (.-JSDocNamepathType typescript/SyntaxKind))

(def js-doc (.-JSDoc typescript/SyntaxKind))

(def js-doc-comment (.-JSDocComment typescript/SyntaxKind))

(def js-doc-text (.-JSDocText typescript/SyntaxKind))

(def js-doc-type-literal (.-JSDocTypeLiteral typescript/SyntaxKind))

(def js-doc-signature (.-JSDocSignature typescript/SyntaxKind))

(def js-doc-link (.-JSDocLink typescript/SyntaxKind))

(def js-doc-link-code (.-JSDocLinkCode typescript/SyntaxKind))

(def js-doc-link-plain (.-JSDocLinkPlain typescript/SyntaxKind))

(def js-doc-tag (.-JSDocTag typescript/SyntaxKind))

(def js-doc-augments-tag (.-JSDocAugmentsTag typescript/SyntaxKind))

(def js-doc-implements-tag (.-JSDocImplementsTag typescript/SyntaxKind))

(def js-doc-author-tag (.-JSDocAuthorTag typescript/SyntaxKind))

(def js-doc-deprecated-tag (.-JSDocDeprecatedTag typescript/SyntaxKind))

(def js-doc-class-tag (.-JSDocClassTag typescript/SyntaxKind))

(def js-doc-public-tag (.-JSDocPublicTag typescript/SyntaxKind))

(def js-doc-private-tag (.-JSDocPrivateTag typescript/SyntaxKind))

(def js-doc-protected-tag (.-JSDocProtectedTag typescript/SyntaxKind))

(def js-doc-readonly-tag (.-JSDocReadonlyTag typescript/SyntaxKind))

(def js-doc-override-tag (.-JSDocOverrideTag typescript/SyntaxKind))

(def js-doc-callback-tag (.-JSDocCallbackTag typescript/SyntaxKind))

(def js-doc-overload-tag (.-JSDocOverloadTag typescript/SyntaxKind))

(def js-doc-enum-tag (.-JSDocEnumTag typescript/SyntaxKind))

(def js-doc-parameter-tag (.-JSDocParameterTag typescript/SyntaxKind))

(def js-doc-return-tag (.-JSDocReturnTag typescript/SyntaxKind))

(def js-doc-this-tag (.-JSDocThisTag typescript/SyntaxKind))

(def js-doc-type-tag (.-JSDocTypeTag typescript/SyntaxKind))

(def js-doc-template-tag (.-JSDocTemplateTag typescript/SyntaxKind))

(def js-doc-typedef-tag (.-JSDocTypedefTag typescript/SyntaxKind))

(def js-doc-see-tag (.-JSDocSeeTag typescript/SyntaxKind))

(def js-doc-property-tag (.-JSDocPropertyTag typescript/SyntaxKind))

(def js-doc-throws-tag (.-JSDocThrowsTag typescript/SyntaxKind))

(def js-doc-satisfies-tag (.-JSDocSatisfiesTag typescript/SyntaxKind))

(def syntax-list (.-SyntaxList typescript/SyntaxKind))

(def not-emitted-statement (.-NotEmittedStatement typescript/SyntaxKind))

(def partially-emitted-expression (.-PartiallyEmittedExpression typescript/SyntaxKind))

(def comma-list-expression (.-CommaListExpression typescript/SyntaxKind))

(def synthetic-reference-expression (.-SyntheticReferenceExpression typescript/SyntaxKind))

(def count (.-Count typescript/SyntaxKind))

(def first-assignment (.-FirstAssignment typescript/SyntaxKind))

(def last-assignment (.-LastAssignment typescript/SyntaxKind))

(def first-compound-assignment (.-FirstCompoundAssignment typescript/SyntaxKind))

(def last-compound-assignment (.-LastCompoundAssignment typescript/SyntaxKind))

(def first-reserved-word (.-FirstReservedWord typescript/SyntaxKind))

(def last-reserved-word (.-LastReservedWord typescript/SyntaxKind))

(def first-keyword (.-FirstKeyword typescript/SyntaxKind))

(def last-keyword (.-LastKeyword typescript/SyntaxKind))

(def first-future-reserved-word (.-FirstFutureReservedWord typescript/SyntaxKind))

(def last-future-reserved-word (.-LastFutureReservedWord typescript/SyntaxKind))

(def first-type-node (.-FirstTypeNode typescript/SyntaxKind))

(def last-type-node (.-LastTypeNode typescript/SyntaxKind))

(def first-punctuation (.-FirstPunctuation typescript/SyntaxKind))

(def last-punctuation (.-LastPunctuation typescript/SyntaxKind))

(def first-token (.-FirstToken typescript/SyntaxKind))

(def last-token (.-LastToken typescript/SyntaxKind))

(def first-trivia-token (.-FirstTriviaToken typescript/SyntaxKind))

(def last-trivia-token (.-LastTriviaToken typescript/SyntaxKind))

(def first-literal-token (.-FirstLiteralToken typescript/SyntaxKind))

(def last-literal-token (.-LastLiteralToken typescript/SyntaxKind))

(def first-template-token (.-FirstTemplateToken typescript/SyntaxKind))

(def last-template-token (.-LastTemplateToken typescript/SyntaxKind))

(def first-binary-operator (.-FirstBinaryOperator typescript/SyntaxKind))

(def last-binary-operator (.-LastBinaryOperator typescript/SyntaxKind))

(def first-statement (.-FirstStatement typescript/SyntaxKind))

(def last-statement (.-LastStatement typescript/SyntaxKind))

(def first-node (.-FirstNode typescript/SyntaxKind))

(def first-js-doc-node (.-FirstJSDocNode typescript/SyntaxKind))

(def last-js-doc-node (.-LastJSDocNode typescript/SyntaxKind))

(def first-js-doc-tag-node (.-FirstJSDocTagNode typescript/SyntaxKind))

(def last-js-doc-tag-node (.-LastJSDocTagNode typescript/SyntaxKind))
