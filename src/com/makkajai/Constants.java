package com.makkajai;

/**
 * Constants - The constants used through out the code.
 * (c) 2015 Makkajai
 * @author Deep Shah
 * This code is licensed under MIT license (see LICENSE.txt for details)
 */
public class Constants {

    public static final String STATIC_INVOCATION_OPERATOR = "::";
    public static final String INSTANCE_INVOCATION_OPERATOR = "->";
    public static final String H = ".h";
    public static final String M = ".m";
    public static final String CPP = ".cpp";
    public static final String USING_NS_CC = "USING_NS_CC;\n";
    public static final String ID = "id";
    public static final String BEGINS_WITH_ID = "id\\W*<([A-Za-z]+)>\\W*";
    public static final String BEGINS_WITH_2_UPPER_CASE_LETTERS = "([A-Z]{2})(.*)";
    public static final String BEGINS_WITH_UPPER_CASE_LETTERS = "(\\_\\_)?([A-Z]{1})(.*)";
    public static final String CC = "CC";

    public static final String COCOS2D = "cocos2d" + STATIC_INVOCATION_OPERATOR;
    public static final String CC_SYNTHESIZE = "CC_SYNTHESIZE_RETAIN(";
    public static final String CC_SYNTHESIZE_PASS_BY_REF = "CC_SYNTHESIZE_PASS_BY_REF(";
    public static final String ASTERISK = "*";
    public static final String CCARRAY_FOREACH = "CCARRAY_FOREACH(";
    public static final String DYNAMIC_CAST = " = dynamic_cast<";
    public static final String CLASS = "class ";
    public static final String PURE_VIRTUAL_METHOD_POSTFIX = " = 0";
    public static final String CC_CALLBACK = "CC_CALLBACK_";
    public static final String EMPTY_STRING = "";
    public static final String FILE_NAME_WITH_H_OR_M = "(.*\\.h)|(.*\\.m)";
    public static final String H_OR_M = "(\\.h)|(\\.m)";
    public static final String INIT = "init";
    public static final String SZ_WIN = "szWin.";
    public static final String Y = ".y";
    public static final String X = ".x";
    public static final String SETTER_PLACEHOLDER = "SETTER_PLACEHOLDER(";

    public static class Keywords {
        public static final String SUPER = "super";
        public static final String BASE = "base";
        public static final String THIS = "this";
        public static final String SELF = "self";
        public static final String NIL = "nil";
        public static final String NULL = "NULL";
        public static final String AT_PUBLIC = "@public";
        public static final String PUBLIC = "public:";
        public static final String PROTECTED = "protected:";
        public static final String AT_PROTECTED = "@protected";
        public static final String PRIVATE = "private:";
        public static final String AT_PRIVATE = "@private";
        public static final String IMPORT = "#import ";
        public static final String INCLUDE = "#include ";
        public static final String END = "@end";
        public static final String YES = "YES";
        public static final String TRUE = "true";
        public static final String NO = "NO";
        public static final String FALSE = "false";
        public static final String AT_QUOTE = "@\"";
        public static final String QUOTE = "\"";
        public static final String PERCENTAGE_QUOTE = "%@";
        public static final String PERCENTAGE_S = "%s";

        public static final String AT_CLASS = "@class";
        public static final String AT_PROTOCOL = "@protocol";

        public static final String CLASS = "class";

        public static final String SEQUENCE_ACTIONS = "Sequence::actions";
        public static final String SEQUENCE_CREATEWITHVARIABLELIST = "Sequence::create";

        public static final String ACTIONFINITETIME = "ActionFiniteTime";
        public static final String FINITETIMEACTION = "FiniteTimeAction";

        public static final String ACTIONMOVETO_CREATEPOSITION = "ActionMoveTo::createPosition";
        public static final String MOVETO_CREATE = "MoveTo::create";

        public static final String ACTIONREPEATFOREVER_ACTIONWITHACTION = "ActionRepeatForever::actionWithAction";
        public static final String REPEATFOREVER_CREATE = "RepeatForever::create";

        public static final String ACTIONSCALETO_CREATESCALE = "ActionScaleTo::createScale";
        public static final String SCALETO_CREATE = "ScaleTo::create";

        public static final String ACTIONFADETO_CREATEOPACITY = COCOS2D + "ActionFadeTo::createOpacity";
        public static final String MAKKAJAIFADETO_CREATE = "MakkajaiFadeTo::create";

        public static final String ACTIONFADEIN_CREATEOPACITY = COCOS2D + "ActionFadeIn::create";
        public static final String MAKKAJAIFADEIN_CREATE = COCOS2D + "FadeIn::create";

        public static final String ACTIONFADEOUT_CREATEOPACITY = COCOS2D + "ActionFadeOut::create";
        public static final String MAKKAJAIFADEOUT_CREATE = COCOS2D + "FadeOut::create";

        public static final String ACTION = COCOS2D + "Action";

        public static final String ISEQUALTOSTRING = "isEqualToString";
        public static final String ISEQUAL = "isEqual";

        public static final String UP_FLOAT = "Float";
        public static final String FLOAT = "float";

        public static final String ACTIONSPAWN_ACTIONS = "ActionSpawn::actions";
        public static final String SPAWN_CREATE = "Spawn::create";

        public static final String ACTIONROTATEBY_CREATEANGLE = "ActionRotateBy::createAngle";
        public static final String ROTATEBY_CREATE = "RotateBy::create";

        public static final String ACTIONSCALEBY_CREATESCALE = "ActionScaleBy::createScale";
        public static final String SCALEBY_CREATE = "ScaleBy::create";

        public static final String SPRITE_SPRITEWITHIMAGENAMED = "Sprite::spriteWithImageNamed";
        public static final String SPRITE_CREATEWITHSPRITEFRAMENAME = "Sprite::createWithSpriteFrameName";

        public static final String SPRITE_SPRITEWITHFILE = "Sprite::spriteWithFile";
        public static final String SPRITE_CREATE = "Sprite::create";

        public static final String ACTIONEASEBOUNCEOUT_ACTIONWITHACTION = "ActionEaseBounceOut::actionWithAction";
        public static final String EASEBOUNCEOUT_CREATE = "EaseBounceOut::create";

        public static final String SZWIN_GETWIDTH = "szWin->getWidth\\(\\)";
        public static final String SZWIN_WIDTH = "szWin.width";

        public static final String SZWIN_GETHEIGHT = "szWin->getHeight\\(\\)";
        public static final String SZWIN_HEIGHT = "szWin.height";

        public static final String GETSZWIN_GETWIDTH = "getSzWin\\(\\)\\)->getWidth\\(\\)";
        public static final String GETSZWIN_WIDTH = "getSzWin()).width";

        public static final String GETSZWIN_GETHEIGHT = "getSzWin\\(\\)\\)->getHeight\\(\\)";
        public static final String GETSZWIN_HEIGHT = "getSzWin()).height";

        public static final String GETCONTENTSIZE_GETWIDTH = "getContentSize\\(\\)\\)->getWidth\\(\\)";
        public static final String GETCONTENTSIZE_WIDTH = "getContentSize()).width";

        public static final String GETCONTENTSIZE_GETHEIGHT = "getContentSize\\(\\)\\)->getHeight\\(\\)";
        public static final String GETCONTENTSIZE_HEIGHT = "getContentSize()).height";

        public static final String CONST_STD_STRING_POINTER = "const std::string\\W*\\*";
        public static final String CONST_STD_STRING = "const std::string ";

        public static final String CGPOINTZERO = "CGPointZero";
        public static final String VEC2_ZERO = "Vec2(0,0)";

        public static final String BUTTON = COCOS2D + "Button";
        public static final String UI_BUTTON = COCOS2D + "ui::Button";

        public static final String ARRAY_WITH = "arrayWith";
        public static final String CREATE_WITH = "createWith";

        public static final String DICTIONARY_WITH = "dictionaryWith";
        public static final String STRING_WITH = "stringWith";

        public static final String DDLOGVERBOSE = "DDLogVerbose";
        public static final String CCLOGINFO = "CCLOGINFO";

        public static final String DDLOGWARN = "DDLogWarn";
        public static final String CCLOGWARN = "CCLOGWARN";

        public static final String DDLOGERROR = "DDLogError";
        public static final String CCLOGERROR = "CCLOGERROR";

        public static final String TOBEDELETED_TEMP_STRING = "@TOBEDELETED_TEMP_STRING";
        public static final String EMPTY = "";

        public static final String __ARRAY_ARRAY = "__Array::array\\(\\)";
        public static final String __ARRAY_CREATE = "__Array::create()";

        public static final String DIRECTOR_SHARED_DIRECTOR = "Director::sharedDirector\\(\\)";
        public static final String DIRECTOR_GETINSTANCE = "Director::getInstance()";

        public static final String CCBUTTON = "CCButton";

        public static final String UBYTE = "ubyte";
        public static final String GLUBYTE = "GLubyte";

        public static final String TIME = "cocos2d::Time";

        public static final String GETX = "->getX\\(\\)";
        public static final String X = ".x";

        public static final String GETY = "->getY\\(\\)";
        public static final String Y = ".y";

        public static final String GETWIDTH = "->getWidth\\(\\)";
        public static final String WIDTH = ".width";

        public static final String GETHEIGHT = "->getHeight\\(\\)";
        public static final String HEIGHT = ".height";

        public static final String GETSIZE = "->getSize\\(\\)";
        public static final String SIZE = ".size";

        public static final String GETORIGIN = "->getOrigin\\(\\)";
        public static final String ORIGIN = ".origin";

        public static final String CGPOINTMAKE = "CGPointMake";
        public static final String VEC2 = COCOS2D + "Vec2";
    }

    public static class Types {
        //Types and their constants.
        public static final String BOOL = "BOOL";

        public static final String NS_OBJECT = "NSObject";
        public static final String REF = COCOS2D + "Ref";

        public static final String ID = "id";
        public static final String REF_POINTER = REF + " *";

        public static final String NS_STRING = "NSString";
        public static final String STRING = COCOS2D + "__String";

        public static final String CCNodeColor = "CCNodeColor";
        public static final String NODE = COCOS2D + "Node";

        public static final String NS_MUTABLE_ARRAY = "NSMutableArray";
        public static final String NS_ARRAY = "NSArray";
        public static final String ARRAY = COCOS2D + "__Array";

        public static final String NS_MUTABLE_SET = "NSMutableSet";
        public static final String NS_SET = "NSSet";
        public static final String SET = COCOS2D + "__Set";

        public static final String CGPOINT = "CGPoint";
        public static final String VEC2 = COCOS2D + "Vec2";

        public static final String CGSIZE = "CGSize";
        public static final String SIZE = COCOS2D + "Size";

        public static final String CGRECT = "CGRect";
        public static final String RECT = COCOS2D + "Rect";

        public static final String NSUINTEGER = "NSUInteger";
        public static final String NSINTEGER = "NSInteger";
        public static final String INT = "int";

        public static final String UP_FLOAT = "Float";
        public static final String FLOAT = "float";

        public static final String NSDICTIONARY = "NSDictionary";
        public static final String NSMUTABLEDICTIONARY = "NSMutableDictionary";
        public static final String DICTIONARY = COCOS2D + "__Dictionary";

        public static final String CCTOUCHEVENT = "CCTouchEvent";
        public static final String EVENT = COCOS2D + "Event";

        public static final String CCACTIONCALLFUNC = "CCActionCallFunc";
        public static final String CALLFUNC = COCOS2D + "CallFunc";

        public static final String CCACTIONCALLFUNCO = "CCActionCallFuncO";
        public static final String CALLFUNCO = COCOS2D + "__CCCallFuncO";

        public static final String CCACTIONCALLBLOCK = "CCActionCallBlock";

        public static final String CCACTIONDELAY = "CCActionDelay";
        public static final String DELAYTIME = COCOS2D + "DelayTime";

        public static final String CCACTIONSEQUENCE = "CCActionSequence";
        public static final String SEQUENCE = COCOS2D + "Sequence";

        public static final String CCCOLOR = "CCColor";
        public static final String MAKKAJAICOLOR = "MakkajaiColor";

        public static final String INSTANCETYPE = "instancetype";

        public static final String CCLABELTTF = "CCLabelTTF";
        public static final String LABEL = COCOS2D + "Label";

        public static final String NSNOTIFICATIONCENTER = "NSNotificationCenter";
        public static final String __NOTIFICATIONCENTER = COCOS2D + "__NotificationCenter";

        public static final String NSNUMBER = "NSNumber";
        public static final String __INTEGER = COCOS2D + "__Integer";

        public static final String SEL = "SEL";
        public static final String SEL_CALLFUNCO = COCOS2D + "SEL_CallFuncO";
    }

    public static class Methods {
        public static final String STRING_WITH_FORMAT = "stringWithFormat";
        public static final String CREATE_WITH_FORMAT = "createWithFormat";

        public static final String CCP = "ccp";
        public static final String VEC2 = COCOS2D + "Vec2";

        public static final String CG_RECT_MAKE = "CGRectMake";
        public static final String RECT = COCOS2D + "Rect";

        public static final String CG_SIZE_MAKE = "CGSizeMake";
        public static final String SIZE = COCOS2D + "Size";

        public static final String ACTIONWITHBLOCK = "actionWithBlock";
        public static final String ACTIONWITHDURATION = "actionWithDuration";

        public static final String CREATE = "create";

        public static final String ACTIONONETWO = "actionOneTwo";
        public static final String CREATEWITHTWOACTIONS = "createWithTwoActions";

        public static final String NODE = "node";

        public static final String ADDCHILDZ = "addChildZ";
        public static final String ADDCHILD = "addChild";

        public static final String SCHEDULEINTERVAL = "scheduleInterval";
        public static final String SCHEDULE = "schedule";

        public static final String ALLOC = "alloc";

        public static final String LABELWITHSTRING_FONTNAME_FONTSIZE = "labelWithStringFontNameFontSize";
        public static final String CREATEWITHTTF = "createWithTTF";

        public static final String ADDOBSERVER_SELECTOR_NAME_OBJECT = "addObserverSelectorNameObject";
        public static final String ADDOBSERVER = "addObserver";

        public static final String ADDCHILDNAME = "addChildName";
        public static final String ADDCHILDTAG= "addChildTag";

        public static final String REMOVECHILDCLEANUP = "removeChildCleanup";
        public static final String REMOVECHILD = "removeChild";

        public static final String REMOVECHILDBYTAGCLEANUP = "removeChildByTagCleanup";
        public static final String REMOVECHILDBYTAG = "removeChildByTag";

        public static final String VIEWSIZE = "viewSize";
        public static final String GETWINSIZE = "getWinSize";

        public static final String RUNNINGSCENE = "runningScene";
        public static final String GETRUNNINGSCENE = "getRunningScene";

        public static final String COPY = "copy";
        public static final String CLONE = "clone";

        public static final String OBJECTFORKEY = "objectForKey";
        public static final String VALUEFORKEY = "valueForKey";

        public static final String SETOBJECTFORKEY = "setObjectForKey";
        public static final String SETOBJECT = "setObject";
    }
}
